package com.models;


public class Users {
    
    private int id;
    private String NumTarj;
    private String Password;
    private double Cuenta;

    public int getId() {
        return id;
    }

    public void setId(int _id) {
        this.id = _id;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String _Password) {
        this.Password = _Password;
    }

    public double getCuenta() {
        return Cuenta;
    }

    public void setCuenta(double _Cuenta) {
        this.Cuenta = _Cuenta;
    }

    public String getNumTarj() {
        return NumTarj;
    }

    public void setNumTarj(String NumTarj) {
        this.NumTarj = NumTarj;
    }
    
    
}
