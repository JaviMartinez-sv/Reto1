package com.example.Reto1.API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.Reto1.Model.Order;
import com.example.Reto1.Model.OrderProduct;
import com.example.Reto1.Model.Product;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class OrdersProductsController {

    // Array de todos los productos
    public static ArrayList<OrderProduct> ordersProductsLists = new ArrayList<OrderProduct>(Arrays.asList(

            new OrderProduct(3, OrdersController.orders.get(0), ProductsController.products.get(0)),
            new OrderProduct(1, OrdersController.orders.get(1), ProductsController.products.get(1)),
            new OrderProduct(2, OrdersController.orders.get(2), ProductsController.products.get(2)),
            new OrderProduct(1, OrdersController.orders.get(3), ProductsController.products.get(3)),
            new OrderProduct(1, OrdersController.orders.get(4), ProductsController.products.get(4))

    ));

    // Obtengo todos la lista de OrderProduct
    @GetMapping("/op")
    public List<OrderProduct> getAll() {
        return ordersProductsLists;
    }

    // Obtener productos por Id / 4.1
    @GetMapping("/owp/{id}")
    public ArrayList<OrderProduct> OrderById(@PathVariable int id) {
        boolean match = false;
        ArrayList<OrderProduct> orderProductDos = new ArrayList<OrderProduct>();

        for (OrderProduct op : ordersProductsLists) {
            if (op.getOrder().getIdOrder() == id) {
                orderProductDos.add(op);
                match = true;
            }
        }
        if (match) {
            return orderProductDos;
        }
        return orderProductDos;
    }

    /*Permite insertar un pedido con los productos y la cantidad de cada producto
    deseada. Se tendrá que devolver, al menos, el ID en la petición para poder
    comprobar que toda la información se ha insertado correctamente. 4.2
    */

    @PostMapping("/insertop")
    public OrderProduct postOrderProduct(@RequestBody OrderProduct op){
        ordersProductsLists.add(op);
        return op;
    }



    /* Permite eliminar un pedido. Al eliminar un pedido también se eliminarán los
    productos vinculados a ese pedido. 4.3*/

    @DeleteMapping("/delop/{id}")
    public void deleteOrderProduct(@PathVariable("id") int id){

        // Recorro la lista ordersProductsLists en busca del id que le he introducido y lo borro
        for(OrderProduct op : ordersProductsLists){
            if(op.getOrder().getIdOrder() == id){
                ordersProductsLists.remove(op);
            }
        }

        // Recorro la lista orders en busca del id que le he introducido y lo borro
        for(Order o : OrdersController.orders){
            if(o.getIdOrder() == id){
                OrdersController.orders.remove(o);
            }
        }

        // Recorro la lista pedidos en busca del id que le he introducido y lo borro
        for(Product p : ProductsController.products){
            if(p.getIdProduct() == id){
                ProductsController.products.remove(p);
            }
        }

    }


    /* En caso de que se proporcione un ID que no exista o haya algún error, la
    petición debería devolver un error HTTP que identifique adecuadamente este
    error. 4.4 */


    






}


