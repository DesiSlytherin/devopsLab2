package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Authentication;

public interface AuthRepo extends JpaRepository<Authentication,String>{
    public Authentication findByUsernameAndPassword(String username, String password);
}
