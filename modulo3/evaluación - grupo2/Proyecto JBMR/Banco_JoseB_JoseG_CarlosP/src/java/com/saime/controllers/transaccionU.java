package com.saime.controllers;

import com.saime.models.TransBank;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;

@Named(value = "tu")
@ApplicationScoped
public class transaccionU implements Serializable {

    // Atributos
    public static final long serialVersionUID = 1L;
    private List<TransBank> lsttransBank;
    
public transaccionU () { 
    this.lsttransBank = new ArrayList<>();
    this.lsttransBank.add(new TransBank("Realizada","Ahorro","Jueves", 200.89));
    this.lsttransBank.add(new TransBank("Realizada","Ahorro","Miercoles", 100.89));
    this.lsttransBank.add(new TransBank("Realizada","corriente","Martes", 300.89));
    this.lsttransBank.add(new TransBank("Realizada","Corriente","Lunes", 400.89));
}

    public List<TransBank> getLsttransBank() {
        return lsttransBank;
    }

    public void setLsttransBank(List<TransBank> lsttransBank) {
        this.lsttransBank = lsttransBank;
    }

}