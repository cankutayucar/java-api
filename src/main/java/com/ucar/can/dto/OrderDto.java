package com.ucar.can.dto;

import java.sql.Timestamp;
import java.time.LocalDate;

public class OrderDto {
    private long id;
    private long companyid;
    private long productid;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCompanyid() {
        return companyid;
    }

    public void setCompanyid(long companyid) {
        this.companyid = companyid;
    }

    public long getProductid() {
        return productid;
    }

    public void setProductid(long productid) {
        this.productid = productid;
    }
}
