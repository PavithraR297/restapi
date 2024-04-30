package com.example.day4post.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="User")
public class User 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pid;
    private String pname;
    private String email;
    private String password;
    public int getId() {
        return pid;
    }
    public void setId(int pid) {
        this.pid = pid;
    }
    public String getName() {
        return pname;
    }
    public void setName(String pname) {
        this.pname = pname;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public User(int pid, String pname, String email, String password) {
        this.pid = pid;
        this.pname = pname;
        this.email = email;
        this.password = password;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public User() {
    }

}
