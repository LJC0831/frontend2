package org.ljc.galley.backend.service;

import io.jsonwebtoken.Claims;

public interface JwtService {
    public String getToken(String key, Object value);    

    Claims getClaims(String getToken);
}
