package org.ljc.galley.backend.service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.security.Key;
import java.security.Signature;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
public class JwtServiceImpl implements JwtService{

    private String secretKey = "adccvdf@@@dfaf4566548787fwee87f878e7ADSFAF@#66548787fwee87f878e7SA66548787fwee87f878e7";
    @Override
    public String getToken(String key, Object Value){
        
        Date expTime = new Date();
        expTime.setTime(expTime.getTime() + 1000 * 60 * 5);
        byte[] secretByteKey = DatatypeConverter.parseBase64Binary(secretKey);
        Key signKey = new SecretKeySpec(secretByteKey,SignatureAlgorithm.HS256.getJcaName());
        
        Map<String, Object> headerMap = new HashMap<>();
        headerMap.put("typ","JWT");
        headerMap.put("alg","HS256");

        Map<String, Object> map = new HashMap<>();
        map.put(key, Value);

        JwtBuilder builder = Jwts.builder().setHeader(headerMap).setClaims(map).setExpiration(expTime).signWith(signKey, SignatureAlgorithm.HS256);

        return builder.compact();
    }
}
