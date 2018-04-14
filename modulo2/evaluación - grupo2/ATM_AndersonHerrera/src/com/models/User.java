package com.models;

public class User {
    private int id;
    private String tarjeta;
    private String clave;
    private double saldo;
    private double dep;
    private String cambiarCon;
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getDep() {
        return dep;
    }

    public void setDep(double dep) {
        this.dep = dep;
    }

    public void setDep(String dep) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getCambiarCon() {
        return cambiarCon;
    }

    public void setCambiarCon(String cambiarCon) {
        this.cambiarCon = cambiarCon;
    }
}
