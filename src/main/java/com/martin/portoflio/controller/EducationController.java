/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.martin.portoflio.controller;

import com.martin.portoflio.dto.education.CreateEducationData;
import com.martin.portoflio.dto.education.EditEducationData;
import com.martin.portoflio.entity.Education;
import com.martin.portoflio.service.EducationService;
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
@RequestMapping("education")
public class EducationController {
    
    @Autowired
    private EducationService educationService;
    
    @GetMapping("/get/{educationId}")
    public Education getById(@PathVariable Integer educationId) {
        return this.educationService.getEducationById(educationId);
    }
    
    @GetMapping("/list/{userId}")
    public List<Education> listEducationsByUser(@PathVariable Integer userId) {
        return this.educationService.listEducationsByUser(userId);
    }
    
    @PostMapping("/create")
    public Education createEducation(@RequestBody @Valid CreateEducationData createEducationData) {
        Education education = new Education(createEducationData);
        return this.educationService.createEducation(education, createEducationData.userId());
    }
    
    @PutMapping("/edit")
    public Education editEducation(@RequestBody @Valid EditEducationData editEducationData) {
        Education education = new Education(editEducationData);
        return this.educationService.editEducation(education);
    }
    
    @DeleteMapping("/delete/{educationId}")
    public void deleteEducation(@PathVariable Integer educationId) {
        this.educationService.deleteEducation(educationId);
    }
    
    
    
}
