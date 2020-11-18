package com.in28minutes.in28minutesdemo.service;

import org.springframework.stereotype.Component;

@Component
public class LoginService {

    public boolean validateUser(String userId, String password)
    {
        return userId.equalsIgnoreCase("aniqua") && password.equalsIgnoreCase("bhau");
    }
}
