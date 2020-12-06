package com.example.Reto1.API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.Reto1.Model.Product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {
    // Array de todos los productos
    public static ArrayList<Product> products = new ArrayList<Product>(Arrays.asList(
        new Product( "Brugal", 13.79,"https://s1.dia.es/medias/h1c/h29/10339760504862.jpg"),
        new Product( "Nordes", 24.49,"https://s1.dia.es/medias/had/h6a/10322545311774.jpg")

    ));

    //Obtengo todos los productos
    @GetMapping("/products")
    public List<Product> getAll(){
        return products;
    }
}
