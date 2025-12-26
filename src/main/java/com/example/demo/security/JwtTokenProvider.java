package com.example.demo.security;

import com.example.demo.entity.User;
import org.springframework.stereotype.Component;

@Component
public class JwtTokenProvider {
    
    public String generateToken(User user) {
        return "mock-jwt-token-for-user-" + user.getId();
    }
    
    public Long getUserIdFromToken(String token) {
        return Long.parseLong(token.split("-")[3]); // Extract from mock token
    }
    
    public boolean validateToken(String token) {
        try {
            Long.parseLong(token.split("-")[3]);
            return token.startsWith("mock-jwt-token");
        } catch (Exception e) {
            return false;
        }
    }
}
