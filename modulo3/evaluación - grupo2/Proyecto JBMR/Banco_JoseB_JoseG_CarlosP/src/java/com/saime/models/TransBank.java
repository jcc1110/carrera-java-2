package com.saime.models;

public class TransBank {
    private String transaccion;
    private String Cuenta;
    private String Fecha;
    private double Monto;

    public TransBank(String transaccion, String Cuenta, String Fecha, double Monto) {
        this.transaccion = transaccion;
        this.Cuenta = Cuenta;
        this.Fecha = Fecha;
        this.Monto = Monto;
    }

    public TransBank(String string) {
        
    }

    public String getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(String transaccion) {
        this.transaccion = transaccion;
    }

    public String getCuenta() {
        return Cuenta;
    }

    public void setCuenta(String Cuenta) {
        this.Cuenta = Cuenta;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public double getMonto() {
        return Monto;
    }

    public void setMonto(double Monto) {
        this.Monto = Monto;
    }
    
}