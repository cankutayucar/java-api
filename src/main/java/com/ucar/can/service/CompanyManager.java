package com.ucar.can.service;

import com.ucar.can.dto.CompanyDto;
import com.ucar.can.model.Company;
import com.ucar.can.repository.CompanyRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CompanyManager implements ICompanyService{
    @Autowired
    private CompanyRepository companyRepository;
    private ModelMapper modelMapper;
    @Autowired
    public CompanyManager(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }


    @Override
    public void addCompany(CompanyDto companyDto) {
        var compayny = modelMapper.map(companyDto, Company.class);
        companyRepository.save(compayny);
    }

    @Override
    public List<CompanyDto> getAllCompany() {
        var companies = companyRepository.findAll();
        var companyDtos = companies.stream()
                .map(company -> modelMapper.map(company,CompanyDto.class))
                .collect(Collectors.toList());
        return companyDtos;
    }

    @Override
    public void updateCompany(CompanyDto companyDto) {
        Optional<Company> optionalCompany = companyRepository.findById(companyDto.getId());
        if (optionalCompany.isPresent()){
            var company = optionalCompany.get();
            company.setCompanyname(companyDto.getCompanyname());
            company.setIscompanyconfirmed(companyDto.isIscompanyconfirmed());
            companyRepository.save(company);
        }
    }
}
