/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.marisaenjel.pegawai.service.Service;

import com.marisaenjel.pegawai.service.Entity.Pegawai;
import com.marisaenjel.pegawai.service.Repository.PegawaiRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author acer
 */
public class PegawaiService {
    @Autowired
    private PegawaiRepository pegawaiRepository;
    
    public Pegawai savePegawai(Pegawai pegawai) {
        return pegawaiRepository.save(pegawai);
    }
    
    public Pegawai findPegawaiById(Long pegawaiId){
        return pegawaiRepository.findByPegawaiId(pegawaiId);
    }
}
