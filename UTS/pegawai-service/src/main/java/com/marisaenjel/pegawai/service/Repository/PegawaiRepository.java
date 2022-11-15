/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.marisaenjel.pegawai.service.Repository;

import com.marisaenjel.pegawai.service.Entity.Pegawai;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author acer
 */
public interface PegawaiRepository extends JpaRepository<Pegawai, Long>{
    public Pegawai findByPegawaiId(Long pegawaiId);
    
}
