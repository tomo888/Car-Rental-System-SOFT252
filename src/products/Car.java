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
public class Car extends Vehicle {
    private String make;
    private String model;
    private String regDetails;
    
    public Car (boolean isAvailable, int price, String dateReturning, Customer customerUsing, String make, String model, String regDetails) {
        super(isAvailable, price, dateReturning, customerUsing);
        this.make = make;
        this.model = model;
        this.regDetails = regDetails;
    }
    
    public String getMake() {
        return make;
    }
    
    public void setMake(String make) {
        this.make = make;
    }
    
    public String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public String getRegDetails() {
        return regDetails;
    }
    
    public void setRegDetails(String regDetails) {
        this.regDetails = regDetails;
    }
    
    
}
