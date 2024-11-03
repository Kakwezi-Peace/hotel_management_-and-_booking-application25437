package com.hotel_management_system.hotel_management_system.service;

import com.hotel_management_system.hotel_management_system.model.Order;
import com.hotel_management_system.hotel_management_system.model.Product;
import com.hotel_management_system.hotel_management_system.model.User;
import com.hotel_management_system.hotel_management_system.repository.OrderRepository;
import com.hotel_management_system.hotel_management_system.repository.ProductRepository;
import com.hotel_management_system.hotel_management_system.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProductRepository productRepository;

    public void saveOrder(Long productId, String email, int quantity) {
        User user = userRepository.findUserByEmail(email)
                .orElseThrow(() -> new RuntimeException("User not found"));
        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        Order order = new Order();
        order.setUser(user);
        order.setProduct(product);
        order.setQuantity(quantity);
        order.setOrderDate(LocalDateTime.now());

        orderRepository.save(order);
    }

    public List<Order> getUserOrders(String email) {
        User user = userRepository.findUserByEmail(email)
                .orElseThrow(() -> new RuntimeException("User not found"));
        return orderRepository.findByUser(user);
    }
}