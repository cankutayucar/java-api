package com.ucar.can.model;

import jakarta.persistence.*;

@Entity
@Table(name = "company")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private boolean iscompanyconfirmed;
    private String companyname;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isIscompanyconfirmed() {
        return iscompanyconfirmed;
    }

    public void setIscompanyconfirmed(boolean iscompanyconfirmed) {
        this.iscompanyconfirmed = iscompanyconfirmed;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }
}
