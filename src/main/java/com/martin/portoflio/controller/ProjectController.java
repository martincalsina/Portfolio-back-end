/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.martin.portoflio.controller;

import com.martin.portoflio.dto.project.CreateProjectData;
import com.martin.portoflio.dto.project.EditProjectData;
import com.martin.portoflio.entity.Project;
import com.martin.portoflio.service.ProjectService;
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
@RequestMapping("project")
public class ProjectController {
    
    @Autowired
    private ProjectService projectService;
    
    @GetMapping("/get/{projectId}")
    public Project getById(@PathVariable Integer projectId) {
        return this.projectService.getProjectById(projectId);
    }
    
    @GetMapping("/list/{userId}")
    public List<Project> listProjectsByUser(@PathVariable Integer userId) {
        return this.projectService.listProjectsByUser(userId);
    }
    
    @PostMapping("/create")
    public Project createProject(@RequestBody @Valid CreateProjectData createProjectData) {
        Project project = new Project(createProjectData);
        return this.projectService.createProject(project, createProjectData.userId());
    }
    
    @PutMapping("/edit")
    public Project editProject(@RequestBody @Valid EditProjectData editProjectData) {
        Project project = new Project(editProjectData);
        return this.projectService.editProject(project);
    }
    
    @DeleteMapping("/delete/{projectId}")
    public void deleteProject(@PathVariable Integer projectId) {
        this.projectService.deleteProject(projectId);
    }
    
    
}
