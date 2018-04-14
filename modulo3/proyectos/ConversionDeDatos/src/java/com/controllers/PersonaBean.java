package com.controllers;
import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "persona")
@RequestScoped
public class PersonaBean implements Serializable {
    // Atributos
    private static final long serialVersionUID = 1L;
    private String fecha;
    private String url;
    private double monto;
    
    // Constructor
    public PersonaBean() {
        this.monto = 1200.50;
    }

    // Métodos
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
}
