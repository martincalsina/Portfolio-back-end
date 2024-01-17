/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.martin.portoflio.service;

import com.martin.portoflio.entity.Experience;
import com.martin.portoflio.entity.User;
import com.martin.portoflio.repository.ExperienceRepository;
import com.martin.portoflio.repository.UserRepository;
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
    
    @Autowired
    private UserRepository userRepository;
    
    @Override
    public Experience getExperienceById(Integer experienceId) {
        return this.experienceRepository.findById(experienceId).orElseThrow();
    }

    @Override
    public List<Experience> listExperiencesByUser(Integer userId) {
        return this.experienceRepository.findByUserId(userId);
    }

    @Override
    public Experience createExperience(Experience experience, Integer userId) {
        User existentUser = userRepository.findById(userId).orElseThrow();
        experience.setUser(existentUser);
        return this.experienceRepository.save(experience);
    }

    @Override
    public Experience editExperience(Experience experience) {
        Experience existentExperience = this.experienceRepository.findById(experience.getId()).orElseThrow();
        
        existentExperience.setInstitution(experience.getInstitution());
        existentExperience.setPosition(experience.getPosition());
        existentExperience.setDescription(experience.getDescription());
        existentExperience.setStartDate(experience.getStartDate());
        existentExperience.setEndDate(experience.getEndDate());
        
        return this.experienceRepository.save(existentExperience);
    }

    @Override
    public void deleteExperience(Integer experienceId) {
        this.experienceRepository.deleteById(experienceId);
    }
    
}
