package com.ucar.can.controller;

import com.ucar.can.dto.ProductDto;
import com.ucar.can.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    private IProductService iProductService;
    @PostMapping
    public void saveProduct(@RequestBody ProductDto productDto){
        iProductService.addProduct(productDto);
    }
}
