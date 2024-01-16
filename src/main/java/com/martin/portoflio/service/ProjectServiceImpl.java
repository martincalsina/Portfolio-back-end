/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.martin.portoflio.service;

import com.martin.portoflio.entity.Project;
import com.martin.portoflio.repository.ProjectRepository;
import java.util.List;
import java.util.Optional;
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

    @Override
    public List<Project> listProjectsByUser(Integer userId) {
        return this.projectRepository.findByUserId(userId);
    }

    @Override
    public Project createProject(Project project) {
        return this.projectRepository.save(project);
    }

    @Override
    public Project editProject(Project project) {
        return this.projectRepository.save(project);
    }

    @Override
    public void deleteProject(Integer projectId) {
        this.projectRepository.deleteById(projectId);
    }
    
    
    
}
