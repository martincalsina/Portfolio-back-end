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
        return this.userRepository.save(user);
    }

    @Override
    public User editUser(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public Boolean existsByEmail(String email) {
        return this.userRepository.existsByEmail(email);
    }
    
    @Override
    public Optional<User> login(String email, String password) {
        return this.userRepository.findByEmailAndPassword(email, password);
    }
    
}
