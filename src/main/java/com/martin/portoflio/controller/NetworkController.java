/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.martin.portoflio.controller;

import com.martin.portoflio.dto.network.CreateNetworkData;
import com.martin.portoflio.dto.network.EditNetworkData;
import com.martin.portoflio.entity.Network;
import com.martin.portoflio.service.NetworkService;
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
@RequestMapping("network")
public class NetworkController {
    
    @Autowired
    private NetworkService networkService;
    
    @GetMapping("/get/{networkId}")
    public Network getById(@PathVariable Integer networkId) {
        return this.networkService.getNetworkById(networkId);
    }
    
    @GetMapping("/list/{userId}")
    public List<Network> listNetworksByUser(@PathVariable Integer userId) {
        return this.networkService.listNetworksByUser(userId);
    }
    
    @PostMapping("/create")
    public Network createNetwork(@RequestBody @Valid CreateNetworkData createNetworkData) {
        Network network = new Network(createNetworkData);
        return this.networkService.createNetwork(network, createNetworkData.userId());
    }
    
    @PutMapping("/edit")
    public Network editNetwork(@RequestBody @Valid EditNetworkData editNetworkData) {
        Network network = new Network(editNetworkData);
        return this.networkService.editNetwork(network);
    }
    
    @DeleteMapping("/delete/{networkId}")
    public void deleteNetwork(@PathVariable Integer networkId) {
        this.networkService.deleteNetwork(networkId);
    }
    
    
}
