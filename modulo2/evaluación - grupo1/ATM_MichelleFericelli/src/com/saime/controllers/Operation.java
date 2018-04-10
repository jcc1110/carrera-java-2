/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saime.controllers;
import com.saime.structures.I_Process;
import com.saime.models.DataAccess;

/**
 * version 1.0.0
 * @author Michelle
 */
public class Operation implements I_Process{
    
    //Atributos
    private String id;
    private String balance;
    private String password;
    private String tarjeta;
    private DataAccess bd;
    private String usuario;
    private String retiro;
    private String nuevaclave;
    
     @Override
    public boolean ingresar(Operation connectToDB) {
            //Instancia las clases necesarias
        DataAccess bd = new DataAccess();
        Operation usuario = new Operation();

        
        // retornando el valor obtenido
        return bd.ingresar(connectToDB);        
}
    @Override
    public boolean consultaSaldo(Operation connectToDB, String balance) {
           //Instancia las clases necesarias
        DataAccess bd = new DataAccess();
        Operation usuario = new Operation();
        //Estableciendo los valores
        usuario.setBalance(balance);
        
        //retornando el valor obtenido
        return bd.consultaSaldo(usuario, balance);
    }

    @Override
    public boolean deposito(DataAccess connectToDB, String balance) {
        //Instancia las clases necesarias
        DataAccess bd = new DataAccess();
        Operation usuario = new Operation();
        //Estableciendo los valores
        usuario.setBalance(balance);
        
        //retornando el valor obtenido
        return bd.deposito(usuario, balance);
    }

    @Override
    public boolean retiro(DataAccess connectToDB, String retiro) {
          //Instancia las clases necesarias
        DataAccess bd = new DataAccess();
        Operation usuario = new Operation();
        //Estableciendo los valores
        usuario.setRetiro(retiro);
        
        //retornando el valor obtenido
        return bd.retiro(usuario, retiro);
    }

    @Override
    public boolean cambioClave(DataAccess connectToDB, String nuevaclave) {
        //instancia las clases necesarias
        DataAccess bd = new DataAccess();
        Operation usuario = new Operation();
        //Estableciendo los valores
        usuario.setNuevaclave(nuevaclave);
        
        //retornando el valor obtenido
        return bd.cambioClave(usuario, nuevaclave);
    }

    public String getId() {
        return id;
    }
    public DataAccess getBd() {
        return bd;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }

    public void setBd(DataAccess bd) {
        this.bd = bd;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public String getRetiro() {
        return retiro;
    }

    public void setRetiro(String retiro) {
        this.retiro = retiro;
    }

    public String getNuevaclave() {
        return nuevaclave;
    }

    public void setNuevaclave(String nuevaclave) {
        this.nuevaclave = nuevaclave;
    }

    public String getBalance() {
        return balance;
    }

}
