package com.ucar.can.repository;

import com.ucar.can.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CompanyRepository extends JpaRepository<Company,Long> {

    @Query("update Company c set c.companyname = :companyname, c.iscompanyconfirmed = :iscompanyconfirmed where c.id = :id")
    void updateCompany(@Param("id") long id, @Param("iscompanyconfirmed") boolean iscompanyconfirmed, @Param("companyname") String companyname);
}
