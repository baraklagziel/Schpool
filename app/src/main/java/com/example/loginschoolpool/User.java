package com.example.loginschoolpool;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class User {
    private String name;
    private String email;
    private String password;
    private String sclass;
    private String gender;
    private String id;
    private String address;

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        password = password;
    }
    public String getUserClass() {
        return sclass;
    }
    public void setClass(String aClass) {
        sclass = aClass;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        gender = gender;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
