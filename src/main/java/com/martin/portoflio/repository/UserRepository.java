/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.martin.portoflio.repository;

import com.martin.portoflio.entity.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author marti
 */

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    
    Boolean existsByEmail(String email);
    
    Optional<User> findByEmailAndPassword(String email, String password);
    
}
