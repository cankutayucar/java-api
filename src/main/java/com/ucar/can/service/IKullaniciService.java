package com.ucar.can.service;

import com.ucar.can.dto.KullaniciDto;
import com.ucar.can.model.Kullanici;

import java.util.List;

public interface IKullaniciService {
    List<KullaniciDto> tumKullanicilariGetir();
    List<KullaniciDto> ismeGoreKullanicilarigetir(String isim);
    KullaniciDto idGoreKullaniciGetir(int id);
    void kullaniciEkle(KullaniciDto kullaniciDto);
    void kullaniciGuncelle(KullaniciDto kullaniciDto);
    void kullaniciSil(int id);
}
