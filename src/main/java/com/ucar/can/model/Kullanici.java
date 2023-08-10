package com.ucar.can.model;

import jakarta.persistence.*;

@Entity
@Table(name = "kullanici")
public class Kullanici {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String isim;

    public void setId(long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}
