package com.ucar.can.controller;

import com.ucar.can.dto.KullaniciDto;
import com.ucar.can.service.IKullaniciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/kullanici")
public class KullaniciController {

    @Autowired
    private IKullaniciService iKullaniciService;

    @GetMapping
    public ResponseEntity<List<KullaniciDto>> getKullaniciList(){
        return ResponseEntity.status(HttpStatus.OK).body(iKullaniciService.tumKullanicilariGetir());
    }

    @PostMapping("/{isim}")
    public ResponseEntity<List<KullaniciDto>> getKullaniciListByName(@PathVariable String isim){
        return ResponseEntity.status(HttpStatus.OK).body(iKullaniciService.ismeGoreKullanicilarigetir(isim));
    }

    @PostMapping("/ideyegorekullanici/{id}")
    public ResponseEntity<KullaniciDto> getKullanici(@PathVariable int id){
        var response = iKullaniciService.idGoreKullaniciGetir(id);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

}
