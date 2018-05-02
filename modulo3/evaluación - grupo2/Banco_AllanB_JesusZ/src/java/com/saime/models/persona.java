package com.saime.models;

public class persona {
     private String nombres;
     private String apellidos;
     private String monto;

    public persona(String jesus, String zerpa, long serialVersionUID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }
    
    public persona(String nombre, String apellido, String monto)
    {
        this.nombres = nombre;
        this.apellidos = apellido;
        this.monto = monto;
    }
    
}
