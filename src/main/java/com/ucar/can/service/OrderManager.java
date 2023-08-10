package com.ucar.can.service;

import com.ucar.can.repository.OrderRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderManager implements IOrderService{
    @Autowired
    private OrderRepository orderRepository;
    private ModelMapper modelMapper;

    @Autowired
    public OrderManager(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }
}
