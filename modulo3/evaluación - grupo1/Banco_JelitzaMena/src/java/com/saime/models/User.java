
package com.saime.models;
/**
 *
 * @author Jelitza Mena
 */
public class User {
    private int id;
    private String username;
    private String password;
    private String firstname;
    private String secondname;
    private String firstsurname;
    private String secondsurname;
    private String phone;
    private String email;
    private String accountnumber;
    private double balance;

    public User(int id, String username, String password, String firstname, String secondname, String firstsurname, String secondsurname, String phone, String email, String accountnumber, double balance) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.secondname = secondname;
        this.firstsurname = firstsurname;
        this.secondsurname = secondsurname;
        this.phone = phone;
        this.email = email;
        this.accountnumber = accountnumber;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    public String getFirstsurname() {
        return firstsurname;
    }

    public void setFirstsurname(String firstsurname) {
        this.firstsurname = firstsurname;
    }

    public String getSecondsurname() {
        return secondsurname;
    }

    public void setSecondsurname(String secondsurname) {
        this.secondsurname = secondsurname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    
    
}