
package com.structures;

/**
 *
 * @author Carlos
 */
public interface I_Process {
        boolean ValidarUsuario (String tarjeta, String clave);
    
    double ConsultaSaldo (String tarjeta);
    
    boolean Deposito (String tarjeta, double deposito);
    
    boolean Retiro (String tarjeta, double deposito);
}
