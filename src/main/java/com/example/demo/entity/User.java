package com.example.demo.entity;
import jakarta.persistence.*;
import java.util.Set;
@Entity
@Table
public class User{
    @Id
    @GeneratedValue(Strategy=GenerationType.IDENTITY)
    private long id;
    private String username;
    private String email;
    private String password;
    private Set<Role> roles;
     
    public User(){

    }
    public User{
        this.id=id;
        this.username=username;
        this.email=email;
        this.password=password;
        this.roles=roles;
    }
    public long setId(){
        return id;
    }
    
}