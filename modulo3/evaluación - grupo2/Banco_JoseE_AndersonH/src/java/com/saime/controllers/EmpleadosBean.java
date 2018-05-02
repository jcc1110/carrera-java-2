/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saime.controllers;

import com.saime.models.Empleado;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author pc5
 */
@Named(value = "empleadosBean")
@ApplicationScoped
public class EmpleadosBean implements Serializable {

    public static final long serialVersionUID = 1L;
    private List<Empleado> lstEmpleados;
    
    
    // Métodos
    public EmpleadosBean() {
        this.lstEmpleados = new ArrayList<>();
        this.lstEmpleados.add(new Empleado("Anderson", "Espinoza", "M", 200.89));
        this.lstEmpleados.add(new Empleado("Anderson", "Espinoza", "M", 300.00));
        this.lstEmpleados.add(new Empleado("Anderson", "Espinoza", "M", 800.00));
        this.lstEmpleados.add(new Empleado("Anderson", "Espinoza", "M", 900.00));
        this.lstEmpleados.add(new Empleado("Anderson", "Espinoza", "M", 6600.00));
        this.lstEmpleados.add(new Empleado("Anderson", "Espinoza", "M", 500.00));
    }

    public List<Empleado> getLstEmpleados() {
        return lstEmpleados;
    }

    public void setLstEmpleados(List<Empleado> lstEmpleados) {
        this.lstEmpleados = lstEmpleados;
    }
    
    
}
