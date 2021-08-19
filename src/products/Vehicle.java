/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package products;

import users.Customer;

/**
 *
 * @author User
 */
public class Vehicle {
    private boolean isAvailable;
    private int price;
    private String dateReturning;
    private Customer customerUsing;
    
    public Vehicle(boolean isAvailable, int price, String dateReturning, Customer customerUsing) {
        this.isAvailable = isAvailable;
        this.price = price;
        this.dateReturning = dateReturning;
        this.customerUsing = customerUsing;
    }
    
    public boolean getIsAvailable() {
        return isAvailable;
    }
    
    public void setIsAvailable() {
        this.isAvailable = isAvailable;
    }
    
    public int getPrice() {
        return price;
    }
    
    public void setPrice() {
        this.price = price;
    }
    
    public String getDateReturning() {
        return dateReturning;
    }
    
    public void setDateReturning() {
        this.dateReturning = dateReturning;
    }
    
    public Customer getCustomerUsing() {
        return customerUsing;
    }
    
    public void setCustomerUsing() {
        this.customerUsing = customerUsing;
    }
}
