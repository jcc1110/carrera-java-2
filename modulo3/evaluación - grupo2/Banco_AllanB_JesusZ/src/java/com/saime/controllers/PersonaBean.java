package com.saime.controllers;

import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import com.saime.models.persona;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named(value = "pb")
@ApplicationScoped
public class PersonaBean implements Serializable{
    
    //Atributos
    public  static final long serialVersionUID = 1L;
    private List<persona> lstpersona;


    public PersonaBean() {
        this.lstpersona = new ArrayList<>();
        this.lstpersona.add(new persona("Jesus", "Zerpa", "100.00BsF"));
        this.lstpersona.add(new persona("Allan", "Berrios", "100.00BsF"));
        this.lstpersona.add(new persona("Jose", "Alcubo", "100.00BsF"));
        this.lstpersona.add(new persona("Anderson", "Herrera", "100.00BsF"));
        this.lstpersona.add(new persona("Anthony", "Hurtado", "100.00BsF"));
    }

    public List<persona> getLstpersona() {
        return lstpersona;
    }

    public void setLstpersona(List<persona> lstpersona) {
        this.lstpersona = lstpersona;
    }
    
}
