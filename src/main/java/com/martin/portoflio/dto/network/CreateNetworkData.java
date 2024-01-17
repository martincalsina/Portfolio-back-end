/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package com.martin.portoflio.dto.network;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 *
 * @author marti
 */
public record CreateNetworkData(
        @NotBlank @Size(max=50) String name,
        @NotBlank @Size(max=100) String icon,
        @NotBlank @Size(max=255) String url,
        @NotNull Integer userId) {

}
