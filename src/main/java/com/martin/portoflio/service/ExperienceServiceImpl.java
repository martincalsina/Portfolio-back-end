/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.martin.portoflio.service;

import com.martin.portoflio.entity.Experience;
import com.martin.portoflio.repository.ExperienceRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author marti
 */

@Service
public class ExperienceServiceImpl implements ExperienceService {
    
    @Autowired
    private ExperienceRepository experienceRepository;

    @Override
    public List<Experience> listExperiencesByUser(Integer userId) {
        return this.experienceRepository.findByUserId(userId);
    }

    @Override
    public Experience createExperience(Experience experience) {
        return this.experienceRepository.save(experience);
    }

    @Override
    public Experience editExperience(Experience experience) {
        return this.experienceRepository.save(experience);
    }

    @Override
    public void deleteExperience(Integer experienceId) {
        this.experienceRepository.deleteById(experienceId);
    }
    
}
