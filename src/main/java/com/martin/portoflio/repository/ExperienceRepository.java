/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.martin.portoflio.repository;

import com.martin.portoflio.entity.Experience;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author marti
 */

@Repository
public interface ExperienceRepository extends JpaRepository<Experience, Integer> {
    
    List<Experience> findByUserId(Integer userId);
    
}
