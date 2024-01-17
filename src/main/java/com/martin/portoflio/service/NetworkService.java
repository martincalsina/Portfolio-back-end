/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.martin.portoflio.service;

import com.martin.portoflio.entity.Network;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author marti
 */
public interface NetworkService {
    
    Network getNetworkById(Integer networkId);
    
    List<Network> listNetworksByUser(Integer userId);
    
    Network createNetwork(Network network, Integer userId);
    
    Network editNetwork(Network network);
    
    void deleteNetwork(Integer networkId);
    
}
