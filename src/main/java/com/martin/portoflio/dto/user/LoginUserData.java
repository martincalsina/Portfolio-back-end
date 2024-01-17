/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package com.martin.portoflio.dto.user;

import jakarta.validation.constraints.NotBlank;

/**
 *
 * @author marti
 */
public record LoginUserData(
        @NotBlank String email,
        @NotBlank String password) {

}
