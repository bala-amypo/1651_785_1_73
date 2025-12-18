package com.example.demo.entity;
import jakarta.persistence.*;
@Entity
public class User{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private String username;
    private Set<Role> roles;

    public User(){

    }
    public User(long id,String username,Set<Role> roles){
        
    }
}