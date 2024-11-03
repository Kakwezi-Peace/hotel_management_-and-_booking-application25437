package com.hotel_management_system.hotel_management_system.repository;


import com.hotel_management_system.hotel_management_system.model.Order;
import com.hotel_management_system.hotel_management_system.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByUser(User user);
}
