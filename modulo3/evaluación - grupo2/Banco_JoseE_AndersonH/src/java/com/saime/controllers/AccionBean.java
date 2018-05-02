/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saime.controllers;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.event.ValueChangeEvent;

/**
 *
 * @author pc11
 */
@Named(value = "cuentas")
@ApplicationScoped
public class AccionBean {
    private static final long serialVersionUID = 1L;
    private String paisSeleccionado = "";
    private List<String> paises;
    private double monto;
    private String concepto;
      
    
   
    public AccionBean() {
        this.paises = new ArrayList<>();
        this.paises.add("---Seleccione---");
        this.paises.add("Jose espinoza 4124-5623-5222-2133");
        this.paises.add("Anderson Herrera 2365 5623 8956 7412");
        this.paises.add("Anthony Hurtado 0134 5236 8741 2563");
        this.paises.add("Jose Bautista 7895 2563 4521 4563");
    }
     public void cambioDeCuenta(ValueChangeEvent e) {
        this.setCuentaSeleccionada(e.getNewValue().toString());
    }

    public String getCuentaSeleccionada() {
        return paisSeleccionado;
    }

    public void setCuentaSeleccionada(String paisSeleccionado) {
        this.paisSeleccionado = paisSeleccionado;
    }

    public List<String> getCuentas() {
        return paises;
    }

    public void setPaises(List<String> paises) {
        this.paises = paises;
    }
     public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }
    
    

    /**
     * Creates a new instance of AccionBean
     */
  
    
}
