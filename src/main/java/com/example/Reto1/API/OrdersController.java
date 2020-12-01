package com.example.Reto1.API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.Reto1.Model.Order;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrdersController {

    // Arrays de todos los pedidos
    public static ArrayList<Order> orders = new ArrayList<Order>(Arrays.asList(
        new Order( "01/12/2020","Juan", "Acepted"),
        new Order( "02/12/2020","Maria", "Cancelled")
    ));

    // Obtengo todos los pedidos
    @GetMapping("/orders")
    public List<Order> getAll(){
        return orders;
    }
}
