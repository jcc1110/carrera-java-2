package com.saime.models;

/**
 *
 * @author 
 */
public class afiliado {
    private String nombre;
    private String apellido;
    private int cuenta;
    private String correo; 
    private int cedula; 

    public afiliado(String nombre, String apellido, int cuenta, String correo, int cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuenta = cuenta;
        this.correo = correo;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    
    
    
    
    
    

   
}
