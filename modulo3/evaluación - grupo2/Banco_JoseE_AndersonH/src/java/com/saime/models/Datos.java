/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saime.models;

/**
 *
 * @author pc5
 */
public class Datos {
    
    private String usuario;
    private String clave;
    private String cedula;
    private String nombre;
    private String apellido;
    private String genero;
    private double salario;
    

    public Datos(String cedula, String nombre, String apellido, String genero, double salario) {
        this.usuario = usuario;
        this.clave = clave;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.salario = salario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
}
