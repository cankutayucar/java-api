package com.ucar.can.configuration;

import com.ucar.can.service.IKullaniciService;
import com.ucar.can.service.KullaniciManager;
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

}
