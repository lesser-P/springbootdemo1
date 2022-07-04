package com.ynh.springbootdemo1.domain;

import lombok.Data;

@Data
public class Result {
    private boolean sucess;
    private Object data;
    private String message;

    @Override
    public String toString() {
        return "Result{" +
                "sucess=" + sucess +
                ", data=" + data +
                ", message='" + message + '\'' +
                '}';
    }
}
