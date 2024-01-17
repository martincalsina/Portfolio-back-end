/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.martin.portoflio.controller;

import com.martin.portoflio.dto.experience.CreateExperienceData;
import com.martin.portoflio.dto.experience.EditExperienceData;
import com.martin.portoflio.entity.Experience;
import com.martin.portoflio.service.ExperienceService;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
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
@RequestMapping("experience")
public class ExperienceController {
    
    @Autowired
    private ExperienceService experienceService;
    
    @GetMapping("/get/{experienceId}")
    public Experience getById(@PathVariable Integer experienceId) {
        return this.experienceService.getExperienceById(experienceId);
    }
    
    @GetMapping("/list/{userId}")
    public List<Experience> listExperiencesByUser(@PathVariable Integer userId) {
        return this.experienceService.listExperiencesByUser(userId);
    }
    
    @PostMapping("/create")
    public Experience createExperience(@RequestBody @Valid CreateExperienceData createExperienceData) {
        Experience experience = new Experience(createExperienceData);
        return this.experienceService.createExperience(experience, createExperienceData.userId());
    }
    
    @PutMapping("/edit")
    public Experience editExperience(@RequestBody @Valid EditExperienceData editExperienceData) {
        Experience experience = new Experience(editExperienceData);
        return this.experienceService.editExperience(experience);
    }
    
    @DeleteMapping("/delete/{experienceId}")
    public void deleteExperience(@PathVariable Integer experienceId) {
        this.experienceService.deleteExperience(experienceId);
    }
    
}
