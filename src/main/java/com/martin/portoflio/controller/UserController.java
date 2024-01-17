/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.martin.portoflio.controller;

import com.martin.portoflio.dto.user.CreateUserData;
import com.martin.portoflio.dto.user.DataEditUser;
import com.martin.portoflio.dto.user.LoginUserData;
import com.martin.portoflio.entity.User;
import com.martin.portoflio.service.UserService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author marti
 */

@RestController
@RequestMapping("user")
public class UserController {
    
    @Autowired
    private UserService userService;
    
    @GetMapping("/get/{id}")
    public User getUserById(@PathVariable Integer id) {
        return this.userService.getUserById(id).orElse(null);
    }
    
    @GetMapping("/exists/{email}")
    public Boolean existsByEmail(@PathVariable String email) {
        return this.userService.existsByEmail(email);
    }
    
    @PostMapping("/login")
    public User login(@RequestBody @Valid LoginUserData userLoginData) {
        return this.userService.login(userLoginData.email(), userLoginData.password()).orElse(null);
    }
    
    @PostMapping("/create")
    public User createUser(@RequestBody @Valid CreateUserData createUserData) {
        User user = new User(createUserData);
        return this.userService.createUser(user);
    }
    
    @PutMapping("/edit")
    @Transactional
    public User editUser(@RequestBody @Valid DataEditUser editUserData) {
        User user = new User(editUserData);
        return this.userService.editUser(user);
    }
    
}
