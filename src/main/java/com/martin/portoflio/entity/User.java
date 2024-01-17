/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.martin.portoflio.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.martin.portoflio.dto.user.CreateUserData;
import com.martin.portoflio.dto.user.DataEditUser;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author marti
 */

@Data
@Table(name="user")
@NoArgsConstructor
@AllArgsConstructor
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
    
    public User(CreateUserData cud) {
        
        this.email=cud.email();
        this.password=cud.password();
        this.name=cud.name();
        this.headline=cud.headline();
        this.description=cud.description();
        this.picture=cud.picture();
        
        this.networks=new ArrayList<>();
        this.skills=new ArrayList<>();
        this.educations=new ArrayList<>();
        this.experiences=new ArrayList<>();
        this.projects=new ArrayList<>();
        
    }
    
    public User(DataEditUser eud) {
        
        this.id=eud.userId();
        this.email=eud.email();
        this.password=eud.password();
        this.name=eud.name();
        this.headline=eud.headline();
        this.description=eud.description();
        this.picture=eud.picture();
        
    }
    
    
}
