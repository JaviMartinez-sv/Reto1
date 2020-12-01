package com.example.Reto1.API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.Reto1.Model.OrderProduct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrdersProductsController {
     // Array de todos los productos
     public static ArrayList<OrderProduct> ordersProductsLists = new ArrayList<OrderProduct>(Arrays.asList(
    
        new OrderProduct( 3, OrdersController.orders.get(0), ProductsController.products.get(0)),
        new OrderProduct( 2, OrdersController.orders.get(1), ProductsController.products.get(1))
       
    ));

    @GetMapping("/ordersProducts")
    public List<OrderProduct> getAll(){
        return ordersProductsLists;
    }
}
