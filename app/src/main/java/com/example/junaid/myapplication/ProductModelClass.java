package com.example.junaid.myapplication;

/**
 * Created by Junaid on 1/7/2019.
 */

public class ProductModelClass {
   private   String name;

    private  String phone;
    private  String date;
     private String quantity;
   private String price;
    private String Category;
    private String bill;

    public ProductModelClass(String name, String phone, String date,String Category, String quantity, String price ,String bill) {
        this.name = name;
        this.phone = phone;
        this.date = date;
        this.quantity = quantity;
        this.price = price;
        this.Category=Category;
        this.bill=bill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getBill() {
        return bill;
    }

    public void setBill(String bill) {
        this.bill = bill;
    }
}
