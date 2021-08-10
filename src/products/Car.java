/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package products;

/**
 *
 * @author User
 */
public class Car {
    private String make;
    private String model;
    private boolean isAvailable;

    public Car(String licenseNumber, String address, String carHired) {
        this.licenseNumber = licenseNumber;
        this.address = address;
        this.carHired = carHired;
    }
}
