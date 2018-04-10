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
    
    public int consultarSaldo(String tarjeta) {       
        // Instancia de las clases necesarias
        DataAccess bd = new DataAccess();
        User usuario = new User();
        
        // Estableciendo los valores
        usuario.setTarjeta(tarjeta);
        
        // returnando el valor obtenido
        return bd.Consulta(usuario);        
    }

    @Override
    public void retirarMonto(String tarjeta, String monto) {
        // Instancia de las clases necesarias
        DataAccess bd = new DataAccess();
        User usuario = new User();
        
        // Estableciendo los valores
        usuario.setTarjeta(tarjeta);
        usuario.setMonto(Double.valueOf(monto));
        
        // returnando el valor obtenido
        bd.Retiro(usuario);        
    }

    @Override
    public void depositarMonto(String tarjeta, String monto) {
        // Instancia de las clases necesarias
        DataAccess bd = new DataAccess();
        User usuario = new User();
        
        // Estableciendo los valores
        usuario.setTarjeta(tarjeta);
        usuario.setMonto(Double.valueOf(monto));
        
        // returnando el valor obtenido
        bd.Deposito(usuario);
    }

    @Override
    public void cambioClave(String tarjeta, String clave) {
        // Instancia de las clases necesarias
        DataAccess bd = new DataAccess();
        User usuario = new User();
        
        // Estableciendo los valores
        usuario.setTarjeta(tarjeta);
        usuario.setClave(clave);
        
        // returnando el valor obtenido
        bd.cambioClave(usuario);
    }

}
