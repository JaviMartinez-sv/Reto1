package com.example.Reto1.Model;

public class OrderProduct {

    private static int count = 0; 
    
    public Order order;
    public Product product;

    public OrderProduct() {
    }


    // Set y Get id

    public OrderProduct( int quantity, Order order, Product product) {

        this.id = count ++;
        this.quantity = quantity;
        this.order = order;
        this.product = product;
	}

	private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Set y Get cantidad

    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


  
}
