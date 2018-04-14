package com.saime.controllers;
/**
 * @author José Bautista
 * version 1.0.0
 */
import com.saime.models.DataAccess;
import com.saime.models.User;

public class Operation {

    public boolean validarUsuario(String tarjeta, String clave) {
        //instancio las clases
        DataAccess bd = new DataAccess();
        User usuario = new User();
        
        // Establezco los valores
        usuario.setTarjeta(tarjeta);
        usuario.setClave(clave);
        
        // retorno el valor obtenido
        return bd.validar(usuario);
    }

    public double consultar(String tarjeta) {
                
        DataAccess bd = new DataAccess();
        User usuario = new User();
        
        usuario.setTarjeta(tarjeta);
        return bd.consultar(usuario);
    }

    public boolean depositar(String tarjeta, double valor) {
        DataAccess bd = new DataAccess();
        User usuario = new User();
        
        usuario.setTarjeta(tarjeta);
        usuario.setDeposito(valor);
        return bd.depositar(usuario);
        
    }
           
     public boolean retirar(String tarjeta, double valor) {
        DataAccess bd = new DataAccess();
        User usuario = new User();
        
        usuario.setTarjeta(tarjeta);
        usuario.setRetiro(valor);
        return bd.retirar(usuario);
    


     }
}


    

