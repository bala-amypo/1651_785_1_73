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
    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id=id;
    }
    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username=username;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email.email;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public Set<Role> getRoles(){
        return roles;
    }
    public void setRoles(Set<Role> roles){
        this.roles=roles;
    }
}