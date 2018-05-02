/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saime.controllers;

import com.saime.models.Datos;
import com.saime.models.Empleado;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author pc11
 */
@Named(value = "datosBean")
@Dependent
public class DatosBean implements Serializable{
    public static final long serialVersionUID = 1L;
    private List<Datos> lstDatos;
    
    

    /**
     * Creates a new instance of Datos
     */
    public DatosBean() {
        this.lstDatos = new ArrayList<>();
        this.lstDatos.add(new Datos("17864450","Anderson", "Espinoza", "M", 200.89));
        
    }

    public List<Datos> getLstDatos() {
        return lstDatos;
    }

    public void setLstDatos(List<Datos> lstDatos) {
        this.lstDatos = lstDatos;
    }
    
}
