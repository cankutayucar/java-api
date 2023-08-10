package com.ucar.can.service;

import com.ucar.can.dto.CompanyDto;

import java.util.List;

public interface ICompanyService {
    void addCompany(CompanyDto companyDto);
    List<CompanyDto> getAllCompany();
    void updateCompany(CompanyDto companyDto);
}
