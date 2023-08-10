package com.ucar.can.service;

import com.ucar.can.dto.KullaniciDto;
import com.ucar.can.model.Kullanici;
import com.ucar.can.repository.KullaniciRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class KullaniciManager implements IKullaniciService{

    @Autowired
    private KullaniciRepository kullaniciRepository;
    private ModelMapper modelMapper;

    @Autowired
    public KullaniciManager(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }


    @Override
    public List<KullaniciDto> tumKullanicilariGetir() {
        var kullaniciList = kullaniciRepository.findAll();
        var kullaniciDtoList = kullaniciList.stream()
                .map(kullanici -> modelMapper.map(kullanici,KullaniciDto.class))
                .collect(Collectors.toList());
        return kullaniciDtoList;
    }

    @Override
    public List<KullaniciDto> ismeGoreKullanicilarigetir(String isim) {
        var kullaniciList = kullaniciRepository.findByKullaniciName(isim);
        var kullaniciDtoList = kullaniciList.stream()
                .map(kullanici -> modelMapper.map(kullanici,KullaniciDto.class))
                .collect(Collectors.toList());
        return kullaniciDtoList;
    }

    @Override
    public KullaniciDto idGoreKullaniciGetir(int id) {
        var kullaniciList = kullaniciRepository.findAll();
        var kullaniciDto = modelMapper.map(kullaniciList.stream()
                .filter(x->x.getId() == id)
                .findFirst().get(),KullaniciDto.class);
        return kullaniciDto;
    }

    @Override
    public void kullaniciEkle(KullaniciDto kullaniciDto) {

    }

    @Override
    public void kullaniciGuncelle(KullaniciDto kullaniciDto) {

    }

    @Override
    public void kullaniciSil(int id) {

    }
}
