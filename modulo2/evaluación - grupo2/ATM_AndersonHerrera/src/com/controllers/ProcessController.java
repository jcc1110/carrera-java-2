package com.controllers;
import com.models.DataAccess;
import com.models.User;
import com.structures.I_Process;

public class ProcessController implements I_Process {

    /**
     *
     * @param tarjeta
     * @param clave
     * @return
     */
    @Override
    public boolean validarUsuario(String tarjeta, String clave) {       
        // Instancia de las clases necesarias
        DataAccess bd = new DataAccess();
        User usuario = new User();
        
        // Estableciendo los valores
        usuario.setTarjeta(tarjeta);
        usuario.setClave(clave);
        
        // returnando el valor obtenido
        return bd.validar(usuario);        
    }

    @Override
    public double saldo(String tarjeta) {
        DataAccess bd = new DataAccess();
        User tarsal = new User();
        
        tarsal.setTarjeta(tarjeta);
        
        return bd.saldo(tarsal);
    }

    @Override
    public double depositar(String dep_sitar) {
        
        DataAccess bd = new DataAccess();
        User dep = new User();
        
        return bd.depositar(dep);
    }

   
  
    
}
