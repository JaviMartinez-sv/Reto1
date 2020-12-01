package com.example.Reto1.Model;

public class Product {

    public Product(){
    }

    public Product(int _id, String _name, double _price, String _image) {
        this.id = _id;
        this.name = _name;
        this.price = _price;
        this.image = _image;
    }

    // Set y Get id

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    

}
