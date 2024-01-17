/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.martin.portoflio.service;

import com.martin.portoflio.entity.Project;
import com.martin.portoflio.entity.User;
import com.martin.portoflio.repository.ProjectRepository;
import com.martin.portoflio.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author marti
 */

@Service
public class ProjectServiceImpl implements ProjectService {
    
    @Autowired
    private ProjectRepository projectRepository;
    
    @Autowired
    private UserRepository userRepository;
    
    @Override
    public Project getProjectById(Integer projectId) {
        return this.projectRepository.findById(projectId).orElseThrow();
    }

    @Override
    public List<Project> listProjectsByUser(Integer userId) {
        return this.projectRepository.findByUserId(userId);
    }

    @Override
    public Project createProject(Project project, Integer userId) {
        User existentUser = userRepository.findById(userId).orElseThrow();
        project.setUser(existentUser);
        return this.projectRepository.save(project);
    }

    @Override
    public Project editProject(Project project) {
        
        Project existentProject = this.projectRepository.findById(project.getId()).orElseThrow();
        
        existentProject.setName(project.getName());
        existentProject.setDescription(project.getDescription());
        existentProject.setPicture(project.getPicture());
        existentProject.setUrl(project.getUrl());
        
        return this.projectRepository.save(existentProject);
    }

    @Override
    public void deleteProject(Integer projectId) {
        this.projectRepository.deleteById(projectId);
    }
    
    
    
}
