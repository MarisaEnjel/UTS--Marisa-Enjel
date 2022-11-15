/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.marisaenjel.gaji.service.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author acer
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Gaji {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long pegawaiId;
    private Long golongan;
    private Long tanggal;
    private Long gajipokok;
    private Long tunjangananak;
    private Long tunjanganistri;
    private Long gajibersih;
    
    public long getGajibersih(){
        gajibersih = gajipokok + tunjangananak + tunjanganistri;
        return gajibersih;
    }
}
