/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import users.Admin;
import users.Customer;

/**
 *
 * @author User
 */
public class UserManagerTest {
    
    public UserManagerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        ArrayList<Customer> testArray = new ArrayList<Customer>();
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testGetInstance() {
        fail("no test");
    }

    @Test
    public void testGetCustomerList() {
        char[] defaultPassword = new char[8];
        defaultPassword[0] = 'p';
        defaultPassword[1] = 'a';
        defaultPassword[2] = 's';
        defaultPassword[3] = 's';
        defaultPassword[4] = 'w';
        defaultPassword[5] = 'o';
        defaultPassword[6] = 'r';
        defaultPassword[7] = 'd';
        Customer c = new Customer("Thomas", "O'Toole", "tomotoole98", defaultPassword, 10293948, "39 Blackford Avenue, Plymouth", null);
        UserManager.getInstance().getCustomerList().add(c);
        Customer result = UserManager.getInstance().getCustomerList().get(0);
        Customer expectedResult = c;
        assertEquals(result, expectedResult);   
    }

    @Test
    public void testSetCustomerList() {
        char[] defaultPassword = new char[8];
        defaultPassword[0] = 'p';
        defaultPassword[1] = 'a';
        defaultPassword[2] = 's';
        defaultPassword[3] = 's';
        defaultPassword[4] = 'w';
        defaultPassword[5] = 'o';
        defaultPassword[6] = 'r';
        defaultPassword[7] = 'd';
        ArrayList<Customer> x = new ArrayList<Customer>();
        Customer a = new Customer("Thomas", "O'Toole", "tomotoole98", defaultPassword, 10293948, "39 Blackford Avenue, Plymouth", null);
        x.add(a);
        UserManager.getInstance().setCustomerList(x);
        Customer result = UserManager.getInstance().getCustomerList().get(0);
        Customer expectedResult = a;
        assertEquals(result, expectedResult);    }

    @Test
    public void testGetAdminList() {
        char[] defaultPassword = new char[8];
        defaultPassword[0] = 'p';
        defaultPassword[1] = 'a';
        defaultPassword[2] = 's';
        defaultPassword[3] = 's';
        defaultPassword[4] = 'w';
        defaultPassword[5] = 'o';
        defaultPassword[6] = 'r';
        defaultPassword[7] = 'd';
        Admin a = new Admin("Thomas", "Pickham", "tompickham99", defaultPassword);
        UserManager.getInstance().getAdminList().add(a);
        Admin result = UserManager.getInstance().getAdminList().get(0);
        Admin expectedResult = a;
        assertEquals(result, expectedResult);       }

    @Test
    public void testSetAdminList() {
        char[] defaultPassword = new char[8];
        defaultPassword[0] = 'p';
        defaultPassword[1] = 'a';
        defaultPassword[2] = 's';
        defaultPassword[3] = 's';
        defaultPassword[4] = 'w';
        defaultPassword[5] = 'o';
        defaultPassword[6] = 'r';
        defaultPassword[7] = 'd';
        ArrayList<Admin> x = new ArrayList<Admin>();
        Admin a = new Admin("Thomas", "Pickham", "tompickham99", defaultPassword);
        x.add(a);
        UserManager.getInstance().setAdminList(x);
        Admin result = UserManager.getInstance().getAdminList().get(0);
        Admin expectedResult = a;
        assertEquals(result, expectedResult);
    }
    
}
