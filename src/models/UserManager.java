/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import users.Customer;
import users.Admin;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import ui_generic.LoginPage;
/**
 *
 * @author User
 */
public class UserManager implements Serializable {
    
    private static UserManager um;
    
    public static UserManager getInstance() {
        if (um == null) {
            um = new UserManager();
        }
        return um;
    }
    
    private ArrayList<Customer> customers = new ArrayList<Customer>(); 
    
    private ArrayList<Admin> admins = new ArrayList<Admin>(); 
    
    
    
    public ArrayList<Customer> getCustomerList() {
        return customers;
    }
    
    public void setCustomerList(ArrayList<Customer> customers) {
        this.customers = customers;
    }
    
    public ArrayList<Admin> getAdminList() {
        return admins;
    }
    
    public void setAdminList(ArrayList<Admin> admins) {
        this.admins = admins;
    }     
    
}

