package com.ucar.can.configuration;

import com.ucar.can.service.*;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.ucar.can.service")
public class Config {


    @Bean
    @Scope("singleton")
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

    @Bean
    @Scope("prototype")
    public IKullaniciService iKullaniciService(){
        return  new KullaniciManager(modelMapper());
    }

    @Bean
    @Scope("prototype")
    public ICompanyService iCompanyService(){
        return new CompanyManager(modelMapper());
    }

    @Bean
    @Scope("prototype")
    public IProductService iProductService(){
        return new ProductManager(modelMapper());
    }

    @Bean
    @Scope("prototype")
    public IOrderService iOrderService(){
        return new OrderManager(modelMapper());
    }
}
