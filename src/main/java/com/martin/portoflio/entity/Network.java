/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.martin.portoflio.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.martin.portoflio.dto.network.CreateNetworkData;
import com.martin.portoflio.dto.network.EditNetworkData;
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
@Table(name="network")
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Network {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    @Column(name="name")
    private String name;
    @Column(name="icon")
    private String icon;
    @Column(name="url")
    private String url;
    
    @ManyToOne
    @JsonBackReference
    private User user;
    
    public Network(CreateNetworkData cnd) {
        
        this.name = cnd.name();
        this.icon = cnd.icon();
        this.url = cnd.url();
        
    }
    
    public Network(EditNetworkData end) {
        
        this.id = end.networkId();
        this.name = end.name();
        this.icon = end.icon();
        this.url = end.url();
        
    }
    
}
