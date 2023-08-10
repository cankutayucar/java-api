package com.ucar.can.repository;

import com.ucar.can.model.Kullanici;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface KullaniciRepository extends JpaRepository<Kullanici, Long> {

    @Query(value = "SELECT k FROM Kullanici k WHERE k.isim = :name")
    List<Kullanici> findByKullaniciName(@Param("name") String name);





}
