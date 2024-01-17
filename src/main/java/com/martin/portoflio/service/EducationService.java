/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.martin.portoflio.service;

import com.martin.portoflio.entity.Education;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author marti
 */
public interface EducationService {

    Education getEducationById(Integer eduactionId);
    
    List<Education> listEducationsByUser(Integer userId);
    
    Education createEducation(Education education, Integer userId);
    
    Education editEducation(Education education);
    
    void deleteEducation(Integer educationId);
    
}
