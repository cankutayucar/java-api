package com.ucar.can.controller;

import com.ucar.can.dto.CompanyDto;
import com.ucar.can.service.ICompanyService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/company")
public class CompanyController {
    @Autowired
    private ICompanyService iCompanyService;

    @GetMapping
    public ResponseEntity<List<CompanyDto>> getAllCompany(){
        var response = iCompanyService.getAllCompany();
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @PostMapping
    public void saveCompany(@RequestBody CompanyDto companyDto){
        iCompanyService.addCompany(companyDto);
    }

    @PutMapping
    public void updateCompany(@RequestBody CompanyDto companyDto){
        iCompanyService.updateCompany(companyDto);
    }
}
