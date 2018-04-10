package com.controllers;
import com.models.DataAccess;
import com.models.User;
import com.structures.I_Process;
import com.views.MainFrame;

/**
 * @author Jose Romero
 * @version 1.0.0
 */
public class Operation implements I_Process {

    @Override
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

    @Override
    public double consultar(String tarjeta) {
                
        DataAccess bd = new DataAccess();
        User usuario = new User();
        
        usuario.setTarjeta(tarjeta);
        return bd.consultar(usuario);
    }

    @Override
    public boolean depositar(String tarjeta) {
        DataAccess bd = new DataAccess();
        User usuario = new User();
        
        usuario.setTarjeta(tarjeta);
        return bd.depositar(usuario);
        
    }
           
        
    

    
  }

