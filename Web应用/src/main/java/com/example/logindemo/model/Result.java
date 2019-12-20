package com.example.logindemo.model;

public class Result<T> {
    int code;
    T data;
    
    public Result(int code, T data) {
        this.code = code;
        this.data = data;
    }
    
    public int getCode() {
        return code;
    }
    
    public void setCode(int code) {
        this.code = code;
    }
    
    public T getData() {
        return data;
    }
    
    public void setData(T data) {
        this.data = data;
    }
}
