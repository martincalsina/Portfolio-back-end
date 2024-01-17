/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package com.martin.portoflio.dto.education;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.time.LocalDate;

/**
 *
 * @author marti
 */
public record EditEducationData(
        @NotNull Integer educationId,
        @NotBlank @Size(max=150) String institution,
        @NotBlank @Size(max=150) String title,
        @NotBlank @Size(max=300) String description,
        @NotNull LocalDate startDate,
        LocalDate endDate) {

}
