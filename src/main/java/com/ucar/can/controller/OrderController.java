package com.ucar.can.controller;

import com.ucar.can.dto.OrderDto;
import com.ucar.can.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/order")
public class OrderController {
    @Autowired
    private IOrderService iOrderService;

    @PostMapping
    public String createOrder(@RequestBody OrderDto orderDto){
        var response = iOrderService.createOrder(orderDto);
        return response;
    }
}
