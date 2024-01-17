/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.martin.portoflio.service;

import com.martin.portoflio.entity.Network;
import com.martin.portoflio.entity.User;
import com.martin.portoflio.repository.NetworkRepository;
import com.martin.portoflio.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author marti
 */

@Service
public class NetworkServiceImpl implements NetworkService {
    
    @Autowired
    private NetworkRepository networkRepository;
    
    @Autowired
    private UserRepository userRepository;
    
    @Override
    public Network getNetworkById(Integer networkId) {
        return this.networkRepository.findById(networkId).orElseThrow();
    }

    @Override
    public List<Network> listNetworksByUser(Integer userId) {
        return this.networkRepository.findByUserId(userId);
    }

    @Override
    public Network createNetwork(Network network, Integer userId) {
        User existentUser = this.userRepository.findById(userId).orElseThrow();
        network.setUser(existentUser);
        return this.networkRepository.save(network);
    }

    @Override
    public Network editNetwork(Network network) {
        Network existentNetwork = this.networkRepository.findById(network.getId()).orElseThrow();
        
        existentNetwork.setName(network.getName());
        existentNetwork.setIcon(network.getIcon());
        existentNetwork.setUrl(network.getUrl());
        
        return this.networkRepository.save(existentNetwork);
    }

    @Override
    public void deleteNetwork(Integer networkId) {
        this.networkRepository.deleteById(networkId);
    }
    
}
