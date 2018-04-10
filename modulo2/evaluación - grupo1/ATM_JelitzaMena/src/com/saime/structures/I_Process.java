
package com.saime.structures;
/**
 * @author Jelitza Mena
 * @version 1.0.0
 */
public interface I_Process {
    
    boolean ValidarUsuario (String tarjeta, String clave);
    
    double ConsultaSaldo (String tarjeta);
    
    boolean Deposito (String tarjeta, double deposito);
    
    boolean Retiro (String tarjeta, double deposito);
        
}
