package com.example.logindemo.controller;

import com.example.logindemo.model.Result;
import com.example.logindemo.model.User;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class LoginController {
    @GetMapping("/")
    public Result login() {
        return new Result(0, new User("abc", 5));
    }
    @PostMapping("/login")
    public Result login(@RequestParam("username") String username, @RequestParam("password")
            String password) {
        System.out.println("login");
        if (username.equals("wang") && password.equals("123456")) {
            return new Result(0, "ok");
        }else{
            return new Result(0, "err");
        }
    }
}
