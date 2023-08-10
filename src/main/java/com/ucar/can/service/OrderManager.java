package com.ucar.can.service;

import com.ucar.can.dto.OrderDto;
import com.ucar.can.model.Order;
import com.ucar.can.repository.CompanyRepository;
import com.ucar.can.repository.OrderRepository;
import com.ucar.can.repository.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
public class OrderManager implements IOrderService{
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private CompanyRepository companyRepository;
    @Autowired
    private ProductRepository productRepository;


    private ModelMapper modelMapper;
    @Autowired
    public OrderManager(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    @Transactional
    public String createOrder(OrderDto orderDto) {
        var company = companyRepository.findById(orderDto.getCompanyid());
        var product = productRepository.findById(orderDto.getProductid());
        if(!company.isPresent() || !product.isPresent()) return "belirtilen şirket veya ürün bulunamadı";
        var p = product.get();
        p.setStock(p.getStock()-1);
        productRepository.save(p);
        var order = modelMapper.map(orderDto, Order.class);
        orderRepository.save(order);
        return "siparişiniz başarıyla oluşturuldu";
    }
}
