package com.ynh.springbootdemo1.domain;

import lombok.Data;

@Data
public class User {
    private int userid;
    private String username;
    private String password;
    private String phone;
    private String emial;

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", emial='" + emial + '\'' +
                '}';
    }
}
