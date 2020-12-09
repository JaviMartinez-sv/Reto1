package com.example.Reto1.Model;

public class Product {

    private static int count = 0; 

    public Product(){
    }

    public Product( String name, double price, String image) {
        this.idProduct = count ++;
        this.name = name;
        this.price = price;
        this.image = image;
    }

    // Set y Get id

    private int idProduct;

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    // Set y Get name

    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Set y Get price

    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Set y Get image
    private String image;
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Product.count = count;
    }
    

}
