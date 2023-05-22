package org.ljc.galley.backend.service;

import java.util.Date;

import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.security.Key;
public class JwtServiceImpl implements JwtService{

    private String secretKey = "adccvdf@@@dfaf4566548787fwee87f878e7";
    @Override
    public String getToken(String key, Object Value){
        
        Date expTime = new Date();
        expTime.setTime(expTime.getTime() + 1000 * 60 * 5);
        byte[] secretByteKey = DatatypeConverter.parseBase64Binary(secretKey);
        

        return null;
    }
}
