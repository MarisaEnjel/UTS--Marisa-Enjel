/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.marisaenjel.gaji.service.Repository;

import com.marisaenjel.gaji.service.Entity.Gaji;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author acer
 */
@Repository
public interface GajiRepository extends JpaRepository<Gaji, Long>{
    public Gaji findByGajiId(Long gajiId);
    
}


