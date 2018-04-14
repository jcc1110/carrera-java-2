
package com.controllers;
import com.models.DataAccess;
import com.models.Usuario;
import com.structures.I_Process;
/**
 *
 * @author Carlos
 */
public class Operation implements I_Process{
        private boolean Acceso;
   
        
         //Instanciando las clases
          
        DataAccess bd = new DataAccess();
        Usuario usuario = new Usuario();

        @Override
    public boolean ValidarUsuario(String tarjeta, String clave) {
        usuario.setTarjeta(tarjeta);
        usuario.setClave(clave);
        
        return bd.ValidarUsuario(usuario);
    }

    public boolean getLogOn() {
        return Acceso;
    }
    
    public void setLogOn(boolean LogOn) {
        this.Acceso = LogOn;
    }

    @Override
    public double ConsultaSaldo(String tarjeta) {
        
        usuario.setTarjeta(tarjeta);
        return bd.ConsultaSaldo(usuario);
    }

    @Override
    public boolean Deposito(String tarjeta, double deposito) {
        String depo;
        if (deposito > 0) {
            
        
        usuario.setTarjeta(tarjeta);
        usuario.setDeposito(deposito);
        
        return bd.deposito(usuario);
        }else
            depo = "El monto debe ser mayor a cero";
            return false;
    }

    @Override
    public boolean Retiro(String tarjeta, double retiro) {
        String reti;
        double saldo = 0;
        
        if (retiro> saldo) {
            
        usuario.setTarjeta(tarjeta);
        usuario.setRetiro(retiro);
        
        return bd.retiro(usuario);
        }else
            reti = "Saldo Insuficiente";
            return true;
    }

    public void setAcceso(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
}