/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
import java.io.Serializable;
import products.Car;
import java.util.*;

/**
 *
 * @author User
 */
public class VehicleManager implements Serializable {
    
    private static ArrayList<Car> cars = new ArrayList<Car>(); 
    
    public ArrayList<Car> getCarList() {
        return cars;
    }
    
    public void setCarList(ArrayList<Car> cars) {
        VehicleManager.cars = cars;
    }

    
}
