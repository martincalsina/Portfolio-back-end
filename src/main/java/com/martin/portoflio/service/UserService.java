/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.martin.portoflio.service;

import com.martin.portoflio.entity.User;
import java.util.Optional;

/**
 *
 * @author marti
 */
public interface UserService {
    
    Optional<User> getUserById(Integer id);
    
    User createUser(User user);
    
    User editUser(User user);
    
    Boolean existsByEmail(String email);
    
    Optional<User> login(String email, String password);
    
}
