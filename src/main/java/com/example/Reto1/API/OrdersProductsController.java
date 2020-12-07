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

    // Obtengo todos la lista de OrderProduct
    @GetMapping("/ordersProducts")
    public List<OrderProduct> getAll(){
        return ordersProductsLists;
    }

    /*
    // Obtengo los pedidos que coincidan con el id de pedido
    @GetMapping("/ordersProducts/{idorder}")
    public ArrayList<OrderProduct>ProductsbyOrderId(@PathVariable int idorder){
        boolean coincide = false;
        ArrayList<OrderProduct> ordersProductsNew = new ArrayList<>();
        for (OrderProduct elemento : ordersProductsLists){
            if(elemento.getOrder().getIdorder()== idorder){
                ordersProductsNew.add(elemento);
                coincide=true;
            }
        }if(coincide){
            return ordersProductsNew;
        }
    }
    

    /*

    @PostMapping("/orderProduct")
    public OrderProduct postOrderProduct(@RequestBody OrderProduct oc){
        ordersProductsLists.add(oc);
        System.out.println(oc.getIdOrderProduct());
        return oc;
    }


    @DeleteMapping("/order/{id}")
    public void deleteOrder(@PathVariable("id") int id){
        for(int i= 0; i< orders.size(); i++){
            if(orders.get(i).getIdOrder() == id){
                orders.remove(i);
            }
        }

        for(int j = (orderProducts.size(); i++){
            if(orders.get(i).getIdOrder() == id){
                orders.remove(i);
            }
        }
    }

    /*
    @DeleteMapping("/orderproducts/{id}")
    public void Delete(@Pathvariable("id") int id){
        ordersProductsLists.remove(findbyOrderProduct(id));
    }
    */




}


