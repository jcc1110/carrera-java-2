/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saime.controllers;

import com.saime.models.DataAccess;
import com.saime.models.Usuario;
import com.saime.structures.I_Process;

/**
 *
 * @author pc11
 */
public class Operation implements I_Process {

    private boolean login;
   
      //Instanciando las clases
    DataAccess bd = new DataAccess();
    Usuario usuario = new Usuario();

    @Override
    public boolean validarUsuario(String tarjeta, String clave) {
                
        usuario.setTarjeta(tarjeta);
        usuario.setClave(clave);
        
        return bd.validar(usuario);
        
    }

    public boolean getLogin() {
        return login;
    }

    public void setLogin(boolean login) {
        this.login = login;
    }

    @Override
    public double consultasaldo(String tarjeta) {
        
        usuario.setTarjeta(tarjeta);
        
        return bd.consultasaldo(usuario);
    }

    @Override
    public boolean deposito(String tarjeta, double deposito) {
        
        usuario.setTarjeta(tarjeta);
        usuario.setDeposito(deposito);
        
        return bd.deposito(usuario);
        
        
    }

    @Override
    public boolean retiro(String tarjeta, double deposito) {
        
        usuario.setTarjeta(tarjeta);
        usuario.setRetiro(deposito);
        
        return bd.retiro(usuario);
        
    }
    
}
