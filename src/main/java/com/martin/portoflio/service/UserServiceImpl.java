/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.martin.portoflio.service;

import com.martin.portoflio.entity.User;
import com.martin.portoflio.repository.UserRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author marti
 */

@Service
public class UserServiceImpl implements UserService {
    
    @Autowired
    private UserRepository userRepository;

    @Override
    public Optional<User> getUserById(Integer id) {
        return this.userRepository.findById(id);
    }

    @Override
    public User createUser(User user) {
        if (this.existsByEmail(user.getEmail())) {
            throw new RuntimeException("There is already a user with the given email");
        }
        return this.userRepository.save(user);
    }

    @Override
    public User editUser(User user) {
        User existentUser = this.userRepository.findById(user.getId()).orElseThrow();
        
        existentUser.setName(user.getName());
        existentUser.setHeadline(user.getHeadline());
        existentUser.setDescription(user.getDescription());
        existentUser.setPicture(user.getPicture());
        
        return this.userRepository.save(existentUser);
    }

    @Override
    public Boolean existsByEmail(String email) {
        return this.userRepository.existsByEmail(email);
    }
    
    @Override
    public Optional<User> login(String email, String password) {
        
        Optional<User> userOptional = this.userRepository.findByEmailAndPassword(email, password);
        
        if (userOptional.isEmpty()) {
            throw new RuntimeException("There is no user with the given credentials");
        }
        
        return userOptional;
        
    }
    
}
