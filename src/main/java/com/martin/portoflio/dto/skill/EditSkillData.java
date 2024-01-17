/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package com.martin.portoflio.dto.skill;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 *
 * @author marti
 */
public record EditSkillData(
    @NotNull Integer skillId,
    @NotBlank @Size(max=100) String name,
    @Size(max=500) String description,
    @Size(max=100) String icon,
    @NotNull Boolean isSoft) {

}
