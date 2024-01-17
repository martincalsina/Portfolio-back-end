/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.martin.portoflio.service;

import com.martin.portoflio.entity.Project;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author marti
 */
public interface ProjectService {
    
    Project getProjectById(Integer projectId);
    
    List<Project> listProjectsByUser(Integer userId);
    
    Project createProject(Project project, Integer userId);
    
    Project editProject(Project project);
    
    void deleteProject(Integer projectId);
    
}
