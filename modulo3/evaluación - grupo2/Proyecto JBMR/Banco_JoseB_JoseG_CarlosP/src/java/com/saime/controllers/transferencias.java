package com.saime.controllers;

import com.saime.models.transferencia;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;

@Named(value = "transferencia")
@ApplicationScoped
public class transferencias implements Serializable {
    // Variable para identificar vistas
    private static final long serialVersionUID = 1L;
    
    // Atributos
    private int cuentaOrigen;
    private int cuentaDestino;
    private String banco;
    private int monto;
    private List<transferencia> lsttrans;

    public transferencias() {
        this.lsttrans = new ArrayList();
        this.lsttrans.add(new transferencia());
        this.lsttrans.add(new transferencia());
    }

     public void nuevatransferencia() {
        this.lsttrans.add(new transferencia(this.getCuentaOrigen(),this.getCuentaDestino(),this.getBanco(),this.getMonto()));
    }

    public int getCuentaOrigen() {
        return cuentaOrigen;
    }

    public void setCuentaOrigen(int cuentaOrigen) {
        this.cuentaOrigen = cuentaOrigen;
    }

    public int getCuentaDestino() {
        return cuentaDestino;
    }

    public void setCuentaDestino(int cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public List<transferencia> getLsttrans() {
        return lsttrans;
    }

    public void setLsttrans(List<transferencia> lsttrans) {
        this.lsttrans = lsttrans;
    }
    
  


    
   
}