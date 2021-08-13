/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
import users.GenericUser;
import users.Customer;
import users.Admin;
import java.util.*;
/**
 *
 * @author User
 */
public class UserManager {
    public static ArrayList<Customer> customers = new ArrayList<Customer>(); 
    
    public ArrayList getCustomerList() {
        return customers;
    }

    public static void setCustomerList(ArrayList customers) {
        UserManager.customers = customers;
    }
}

