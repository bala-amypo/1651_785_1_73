// src/main/java/com/example/demo/dto/AuthRequest.java
package com.example.demo.dto;

import lombok.Data;

@Data
public class AuthRequest {
    private String usernameOrEmail;
    private String password;
}
