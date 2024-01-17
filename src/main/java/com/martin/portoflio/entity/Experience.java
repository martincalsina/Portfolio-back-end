/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.martin.portoflio.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.martin.portoflio.dto.experience.CreateExperienceData;
import com.martin.portoflio.dto.experience.EditExperienceData;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author marti
 */

@Data
@Table(name="experience")
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Experience {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    @Column(name="institution")
    private String institution;
    @Column(name="position")
    private String position;
    @Column(name="description")
    private String description;
    @Column(name="start_date")
    private LocalDate startDate;
    @Column(name="end_date")
    private LocalDate endDate;
    
    @ManyToOne
    @JsonBackReference
    private User user;
    
    public Experience(CreateExperienceData ced) {
        this.institution = ced.institution();
        this.position = ced.position();
        this.description = ced.description();
        this.startDate = ced.startDate();
        this.endDate = ced.endDate();
    }
    
    public Experience(EditExperienceData eed) {
        
        this.id = eed.experienceId();
        this.institution = eed.institution();
        this.position = eed.position();
        this.description = eed.description();
        this.startDate = eed.startDate();
        this.endDate = eed.endDate();
    }
    
}
