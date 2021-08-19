/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

import java.io.Serializable;
import products.Car;

/**
 *
 * @author User
 */
public class Customer extends GenericUser implements Serializable {
    private int licenseNumber;
    private String address;
    private String vehicleHired;

    public Customer(String firstName, String surname, String loginName, char[] password, int licenseNumber, String address, String vehicleHired) {
        super (firstName, surname, loginName, password);
        this.licenseNumber = licenseNumber;
        this.address = address;
        this.vehicleHired = vehicleHired;
    }
    
    public int getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(int licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getVehicleHired () {
        return vehicleHired;
    }
    
    public void setVehicleHired (String vehicleHired) {
        this.vehicleHired = vehicleHired;
    }
}

