/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.martin.portoflio.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.Data;

/**
 *
 * @author marti
 */

@Data
@Table(name="user")
@Entity
public class User {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    @Column(name="email")
    private String email;
    @Column(name="password")
    private String password;
    @Column(name="name")
    private String name;
    @Column(name="headline")
    private String headline;
    @Column(name="description")
    private String description;
    @Column(name="picture")
    private String picture;
    
    @OneToMany(mappedBy="user", cascade=CascadeType.ALL, orphanRemoval=true, fetch=FetchType.LAZY)
    @JsonManagedReference
    private List<Network> networks;
    
    @OneToMany(mappedBy="user", cascade=CascadeType.ALL, orphanRemoval=true, fetch=FetchType.LAZY)
    @JsonManagedReference
    private List<Skill> skills;
    
    @OneToMany(mappedBy="user", cascade=CascadeType.ALL, orphanRemoval=true, fetch=FetchType.LAZY)
    @JsonManagedReference
    private List<Education> educations;
    
    @OneToMany(mappedBy="user", cascade=CascadeType.ALL, orphanRemoval=true, fetch=FetchType.LAZY)
    @JsonManagedReference
    private List<Experience> experiences;
    
    @OneToMany(mappedBy="user", cascade=CascadeType.ALL, orphanRemoval=true, fetch=FetchType.LAZY)
    @JsonManagedReference
    private List<Project> projects;
    
    
}
