/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.martin.portoflio.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.martin.portoflio.dto.skill.CreateSkillData;
import com.martin.portoflio.dto.skill.EditSkillData;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author marti
 */

@Data
@Table(name="skill")
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Skill {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    @Column(name="name")
    private String name;
    @Column(name="description")
    private String description;
    @Column(name="icon")
    private String icon;
    @Column(name="is_soft")
    private Boolean isSoft;
    
    @ManyToOne
    @JsonBackReference
    private User user;
    
    public Skill(CreateSkillData csd) {
        this.name = csd.name();
        this.description = csd.description();
        this.icon = csd.icon();
        this.isSoft = csd.isSoft();
    }
    
    public Skill(EditSkillData esd) {
        this.id = esd.skillId();
        this.name = esd.name();
        this.description = esd.description();
        this.icon = esd.icon();
        this.isSoft = esd.isSoft();
    }
    
    
}
