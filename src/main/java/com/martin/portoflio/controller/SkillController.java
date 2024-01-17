/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.martin.portoflio.controller;

import com.martin.portoflio.dto.skill.CreateSkillData;
import com.martin.portoflio.dto.skill.EditSkillData;
import com.martin.portoflio.entity.Skill;
import com.martin.portoflio.service.SkillService;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author marti
 */

@RestController
@RequestMapping("skill")
public class SkillController {
    
    @Autowired
    private SkillService skillService;
    
    @GetMapping("/get/{skillId}")
    public Skill getById(@PathVariable Integer skillId) {
        return this.skillService.getSkillById(skillId);
    }
    
    @GetMapping("/list/{userId}")
    public List<Skill> listSkillsByUser(@PathVariable Integer userId) {
        return this.skillService.listSkillsByUser(userId);
    }
    
    @PostMapping("/create")
    public Skill createSkill(@RequestBody @Valid CreateSkillData createSkillData) {
        Skill skill = new Skill(createSkillData);
        return this.skillService.createSkill(skill, createSkillData.userId());
    }
    
    @PutMapping("/edit")
    public Skill editSkill(@RequestBody @Valid EditSkillData editSkillData) {
        Skill skill = new Skill(editSkillData);
        return this.skillService.editSkill(skill);
    }
    
    @DeleteMapping("/delete/{skillId}")
    public void deleteSkill(@PathVariable Integer skillId) {
        this.skillService.deleteSkill(skillId);
    }
    
    
}
