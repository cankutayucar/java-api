package com.ucar.can.service;

import com.ucar.can.repository.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductManager implements IProductService{
    @Autowired
    private ProductRepository productRepository;
    private ModelMapper modelMapper;
    @Autowired
    public ProductManager(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }
}
