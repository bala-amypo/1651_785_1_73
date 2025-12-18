package com.example.demo.entity;
import jakarta.persistence.*;
import java.util.Set;
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
        this.id=id;
        this.username=username;
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
        public Set<Role> getRoles(){
            return roles;
        }
        public void setRoles(){
            this.roles=roles;
        }
}