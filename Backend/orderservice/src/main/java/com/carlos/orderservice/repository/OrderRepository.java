package com.carlos.orderservice.repository;

import com.carlos.orderservice.model.Order;
import com.carlos.orderservice.model.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByCustomerName(String customerName);
    List<Order> findByStatus(OrderStatus status);
    List<Order> findByCustomerNameAndStatus(String customerName, OrderStatus status);
}
