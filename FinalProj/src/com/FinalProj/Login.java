package com.FinalProj;

import java.util.Scanner;

public class Login {
    private String username;
    private String password;
    public Login(){
        this("username", "password");
    }
    public Login(String username, String password){
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
