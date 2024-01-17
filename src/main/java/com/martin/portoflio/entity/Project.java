/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.martin.portoflio.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.martin.portoflio.dto.project.CreateProjectData;
import com.martin.portoflio.dto.project.EditProjectData;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

/**
 *
 * @author marti
 */

@Data
@Table(name="project")
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Project {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    @Column(name="name")
    private String name;
    @Column(name="description")
    private String description;
    @Column(name="picture")
    private String picture;
    @Column(name="url")
    private String url;
    
    @ManyToOne
    @JsonBackReference
    private User user;
    
    public Project(CreateProjectData cpd) {
        this.name = cpd.name();
        this.description = cpd.description();
        this.picture = cpd.picture();
        this.url = cpd.url();
    }
    
    public Project(EditProjectData epd) {
        this.id = epd.projectId();
        this.name = epd.name();
        this.description = epd.description();
        this.picture = epd.picture();
        this.url = epd.url();
    }
    
    
}
