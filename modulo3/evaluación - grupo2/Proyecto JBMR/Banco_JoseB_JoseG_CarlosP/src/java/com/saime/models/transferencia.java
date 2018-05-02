package com.saime.models;

/**
 *
 * @author 
 */
public class transferencia {
    private int cuentaOrigen;
    private int cuentaDestino;
    private String banco;
    private int monto;

    public transferencia() {
    }

    
    public transferencia(int cuentaOrigen, int cuentaDestino, String banco, int monto) {
        this.cuentaOrigen = cuentaOrigen;
        this.cuentaDestino = cuentaDestino;
        this.banco = banco;
        this.monto = monto;
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

    
    
    
    
    
    
    

   
}
