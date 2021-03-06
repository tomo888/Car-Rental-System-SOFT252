/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

import java.io.Serializable;

/**
 *
 * @author User
 */
public abstract class GenericUser implements Serializable {
    private String firstName;
    private String surname;
    private String loginName;
    private char[] password;

    public GenericUser(String firstName, String surname, String loginName, char[] password) {
        this.firstName = firstName;
        this.surname = surname;
        this.loginName = loginName;
        this.password = password;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    public String getLoginName(){
        return loginName;
    }
    
    public void setLoginName (String loginName) {
        this.loginName = loginName;
    }

    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }
    
}

