package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.domain.Authentication;

import com.example.demo.repository.AuthRepo;

@Service
public class LogService {
    @Autowired
    private AuthRepo rep;

    public Authentication log(String username, String password){
            Authentication user = rep.findByUsernameAndPassword(username, password);
            return user;
    }

}
