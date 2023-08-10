package com.ucar.can.service;

import com.ucar.can.dto.OrderDto;

public interface IOrderService {
    String createOrder(OrderDto orderDto);
}
