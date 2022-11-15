/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.marisaenjel.pegawai.service.Controller;

import com.marisaenjel.pegawai.service.Entity.Pegawai;
import com.marisaenjel.pegawai.service.Service.PegawaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author acer
 */
@RestController
@RequestMapping("/nasabah")

public class PegawaiController {
    @Autowired
    private PegawaiService pegawaiService;
    
    @PostMapping("/")
    public Pegawai savePegawai(@RequestBody Pegawai pegawai){
        return pegawaiService.savePegawai(pegawai);
    }
    
    @GetMapping("{id}")
    public Pegawai findPegawaiById(@PathVariable("id") Long pegawaiId){
        return pegawaiService.findPegawaiById(pegawaiId);
    } 
}
