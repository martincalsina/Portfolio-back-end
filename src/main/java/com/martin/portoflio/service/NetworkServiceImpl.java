/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.martin.portoflio.service;

import com.martin.portoflio.entity.Network;
import com.martin.portoflio.repository.NetworkRepository;
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

    @Override
    public List<Network> listNetworksByUser(Integer userId) {
        return this.networkRepository.findByUserId(userId);
    }

    @Override
    public Network createNetwork(Network network) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Network editNetwork(Network network) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteNetwork(Integer networkId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
