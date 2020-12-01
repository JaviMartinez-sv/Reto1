package com.example.Reto1.API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.Reto1.Model.Order;

import org.springframework.web.bind.annotation.GetMapping;

public class OrdersController {

    public static ArrayList<Order> orders = new ArrayList<Order>(Arrays.asList(
        new Order(1, "01/12/2020","Juan", "Acepted"),
        new Order(2, "02/12/2020","Maria", "Cancelled")
    ));

    // Obtengo todos los pedidos
    @GetMapping("/orders")
    public List<Order> getAll(){
        return orders;
    }
}
