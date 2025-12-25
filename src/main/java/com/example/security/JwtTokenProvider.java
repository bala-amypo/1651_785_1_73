package com.example.demo.security;

import com.example.demo.entity.User;
import org.springframework.stereotype.Component;

@Component
public class JwtTokenProvider {

    // token format: userId|username
    public String generateToken(User user) {
        return user.getId() + "|" + user.getUsername();
    }

    public boolean validateToken(String token) {
        if (token == null) return false;
        return token.contains("|");
    }

    public Long getUserIdFromToken(String token) {
        try {
            return Long.parseLong(token.split("\\|")[0]);
        } catch (Exception e) {
            return null;
        }
    }

    public String getUsernameFromToken(String token) {
        try {
            return token.split("\\|")[1];
        } catch (Exception e) {
            return null;
        }
    }
}
