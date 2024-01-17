/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.martin.portoflio.service;

import com.martin.portoflio.entity.Education;
import com.martin.portoflio.entity.Education;
import com.martin.portoflio.entity.User;
import com.martin.portoflio.repository.EducationRepository;
import com.martin.portoflio.repository.EducationRepository;
import com.martin.portoflio.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author marti
 */

@Service
public class EducationServiceImpl implements EducationService {
    
    @Autowired
    private EducationRepository educationRepository;
    
    @Autowired
    private UserRepository userRepository;
    
    @Override
    public Education getEducationById(Integer educationId) {
        return this.educationRepository.findById(educationId).orElseThrow();
    }

    @Override
    public List<Education> listEducationsByUser(Integer userId) {
        return this.educationRepository.findByUserId(userId);
    }

    @Override
    public Education createEducation(Education education, Integer userId) {
        User existentUser = userRepository.findById(userId).orElseThrow();
        education.setUser(existentUser);
        return this.educationRepository.save(education);
    }

    @Override
    public Education editEducation(Education education) {
        Education existentEducation = this.educationRepository.findById(education.getId()).orElseThrow();
        
        existentEducation.setInstitution(education.getInstitution());
        existentEducation.setTitle(education.getTitle());
        existentEducation.setDescription(education.getDescription());
        existentEducation.setStartDate(education.getStartDate());
        existentEducation.setEndDate(education.getEndDate());
        
        return this.educationRepository.save(existentEducation);
    }

    @Override
    public void deleteEducation(Integer educationId) {
        this.educationRepository.deleteById(educationId);
    }
    
}
