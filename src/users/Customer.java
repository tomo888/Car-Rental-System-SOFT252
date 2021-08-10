/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

/**
 *
 * @author User
 */
public class Customer extends GenericUser {
    private String licenseNumber;
    private String address;
    private String carHired;

    public Customer(String licenseNumber, String address, String carHired) {
        this.licenseNumber = licenseNumber;
        this.address = address;
        this.carHired = carHired;
    }
    
    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getCarHired () {
        return carHired;
    }
    
    public void setCarHired () {
        this.carHired = carHired;
    }
}

