package com.hotel_management_system.hotel_management_system.global;

import com.hotel_management_system.hotel_management_system.model.Product;

import java.util.ArrayList;
import java.util.List;

public class GlobalData {
    public static List<Product> cart;
    static {
        cart = new ArrayList<Product>();
    }
}
