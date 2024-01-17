/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.martin.portoflio.dto.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

/**
 *
 * @author marti
 */
public record CreateUserData(
        @NotBlank @Email @Size(max=100) String email,
        @NotBlank @Size(max=100) String password,
        @NotBlank @Size(max=150) String name,
        @Size(max=150) String headline,
        @Size(max=500) String description,
        @Size(max=255) String picture
        ) {
    
}
