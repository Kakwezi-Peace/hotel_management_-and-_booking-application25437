package com.hotel_management_system.hotel_management_system.repository;


import com.hotel_management_system.hotel_management_system.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {
    List<Product> findAllByCategoryId(int id);

}
