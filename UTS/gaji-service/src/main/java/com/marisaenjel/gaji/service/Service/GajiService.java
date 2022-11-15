/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.marisaenjel.gaji.service.Service;

import com.marisaenjel.gaji.service.Entity.Gaji;
import com.marisaenjel.gaji.service.Repository.GajiRepository;
import com.marisaenjel.gaji.service.vo.Pegawai;
import com.marisaenjel.gaji.service.vo.ResponseTemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author acer
 */
@Service
public class GajiService {
    @Autowired
    private GajiRepository gajiRepository;
    
    @Autowired
    private RestTemplate restTemplate;
    
    public Gaji saveGaji(Gaji gaji){
        return gajiRepository.save(gaji);
    }
    
    public ResponseTemplateVO getGaji(Long gajiId){
        ResponseTemplateVO vo = new ResponseTemplateVO();
        Gaji gaji = gajiRepository.findByGajiId(gajiId);
        Pegawai pegawai = restTemplate.getForObject("http://localhost:8055/pegawai/" 
              + gaji.getPegawaiId(), Pegawai.class);
        vo.setGaji(gaji);
        vo.setPegawai(pegawai);
        return vo;
    }
}
