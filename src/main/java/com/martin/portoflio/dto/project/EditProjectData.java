/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package com.martin.portoflio.dto.project;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 *
 * @author marti
 */
public record EditProjectData(
        @NotNull Integer projectId,
        @NotBlank @Size(max=100) String name,
        @NotBlank @Size(max=200) String description,
        @Size(max=255) String picture,
        @Size(max=255) String url) {

}
