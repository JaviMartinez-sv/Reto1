package com.example.Reto1.Model;

public class Order {
    
    public Order(){
    }

    public enum status{
        INPROGRESS,
        ACEPTED,
        SENT,
        DELIVERED,
        CANCELLED;

    }
    





    public Order(int _id, String _date, String _user, String _status) {
        this.id = _id;
        this.date = _date;
        this.user = _user;
        this.status = _status;
    }

    // Set y Get id
    
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Set y Get date

    private String date ;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    // Set y Get User

    private String user;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    // Set y Get state
    private String status;
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
