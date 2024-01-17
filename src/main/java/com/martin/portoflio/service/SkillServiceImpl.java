/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.martin.portoflio.service;

import com.martin.portoflio.entity.Skill;
import com.martin.portoflio.entity.User;
import com.martin.portoflio.repository.SkillRepository;
import com.martin.portoflio.repository.UserRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author marti
 */

@Service
public class SkillServiceImpl implements SkillService {
    
    @Autowired
    private SkillRepository skillRepository;
    
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<Skill> listSkillsByUser(Integer userId) {
        return this.skillRepository.findByUserId(userId);
    }

    @Override
    public Skill createSkill(Skill skill, Integer userId) {
        User existentUser = userRepository.findById(userId).orElseThrow();
        skill.setUser(existentUser);
        return this.skillRepository.save(skill);
    }

    @Override
    public Skill editSkill(Skill skill, Integer userId) {
        User existentUser = userRepository.findById(userId).orElseThrow();
        skill.setUser(existentUser);
        return this.skillRepository.save(skill);
    }

    @Override
    public void deleteSkill(Integer skillId) {
        this.skillRepository.deleteById(skillId);
    }
    
}
