/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.martin.portoflio.service;

import com.martin.portoflio.entity.Education;
import com.martin.portoflio.repository.EducationRepository;
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

    @Override
    public List<Education> listEducationsByUser(Integer userId) {
        return this.educationRepository.findByUserId(userId);
    }

    @Override
    public Education createEducation(Education education) {
        return this.educationRepository.save(education);
    }

    @Override
    public Education editEducation(Education education) {
        return this.educationRepository.save(education);
    }

    @Override
    public void deleteEducation(Integer educationId) {
        this.educationRepository.deleteById(educationId);
    }
    
}
