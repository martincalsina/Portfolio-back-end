/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.martin.portoflio.service;

import com.martin.portoflio.entity.Experience;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author marti
 */
public interface ExperienceService {
    
    List<Experience> listExperiencesByUser(Integer userId);
    
    Experience createExperience(Experience experience);
    
    Experience editExperience(Experience experience);
    
    void deleteExperience(Integer experienceId);
    
}
