/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.martin.portoflio.service;

import com.martin.portoflio.entity.Skill;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author marti
 */
public interface SkillService {
    
    List<Skill> listSkillsByUser(Integer userId);
    
    Skill createSkill(Skill skill, Integer userId);
    
    Skill editSkill(Skill skill, Integer userId);
    
    void deleteSkill(Integer skillId);
    
}
