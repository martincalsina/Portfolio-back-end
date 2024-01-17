/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.martin.portoflio.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.martin.portoflio.dto.education.CreateEducationData;
import com.martin.portoflio.dto.education.EditEducationData;
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
@Table(name="education")
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Education {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    @Column(name="institution")
    private String institution;
    @Column(name="title")
    private String title;
    @Column(name="description")
    private String description;
    @Column(name="start_date")
    private LocalDate startDate;
    @Column(name="end_date")
    private LocalDate endDate;
    
    @ManyToOne
    @JsonBackReference
    private User user;
    
    public Education(CreateEducationData ced) {
        this.institution = ced.institution();
        this.title = ced.title();
        this.description = ced.description();
        this.startDate = ced.startDate();
        this.endDate = ced.endDate();
    }
    
    public Education(EditEducationData eed) {
        
        this.id = eed.educationId();
        this.institution = eed.institution();
        this.title = eed.title();
        this.description = eed.description();
        this.startDate = eed.startDate();
        this.endDate = eed.endDate();
    }
    
    
}
