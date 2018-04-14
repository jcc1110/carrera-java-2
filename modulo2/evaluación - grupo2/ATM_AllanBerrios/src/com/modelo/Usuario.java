
package com.modelo;


public class Usuario {
    
    private int id;
    private String NumTarje;
    private String Clave;
    private boolean EstadoCuenta;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumTarje() {
        return NumTarje;
    }

    public void setNumTarje(String NumTarje) {
        this.NumTarje = NumTarje;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public boolean isEstadoCuenta() {
        return EstadoCuenta;
    }

    public void setEstadoCuenta(boolean EstadoCuenta) {
        this.EstadoCuenta = EstadoCuenta;
    }
    
}
