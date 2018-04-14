package controllers;
import models.DataAccess;
import models.User;
import structures.I_ATM;

public class ProcessController implements I_ATM {
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
    
   


    public String consultar(String tarjeta) {
        DataAccess bd = new DataAccess();
        User usuario = new User();
        
        // Estableciendo los valores
        usuario.setTarjeta(tarjeta);
        
        
        // returnando el valor obtenido
        return bd.consultar(usuario);
    }
 

    public boolean depositar(String tarjeta, double monto) {
         DataAccess bd = new DataAccess();
        User usuario = new User();
        
        // Estableciendo los valores
        usuario.setSaldo(monto);
        usuario.setTarjeta(tarjeta);
        
        
        // returnando el valor obtenido
        return bd.depositar(tarjeta,monto);
    }

    public boolean retirar(String tarjeta, double monto) {
         DataAccess bd = new DataAccess();
        User usuario = new User();
        
        // Estableciendo los valores
        usuario.setSaldo(monto);
        usuario.setTarjeta(tarjeta);
        
        
        // returnando el valor obtenido
        return bd.retirar(tarjeta,monto);
    }

    public boolean cambiarClave(String tarjeta, String newclave) {
        DataAccess bd = new DataAccess();
        User usuario = new User();
        
        // Estableciendo los valores
        usuario.setClave(newclave);
        usuario.setTarjeta(tarjeta);
        
        
        // returnando el valor obtenido
        return bd.cambiarClave(tarjeta,newclave);
    }

   

    
    
}
