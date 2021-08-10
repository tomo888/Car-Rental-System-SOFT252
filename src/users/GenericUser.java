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
public abstract class GenericUser {
    private String firstName;
    private String surname;
    private String loginName;
    private String password;

    public GenericUser(String firstName, String surname, String loginName, String password) {
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}

