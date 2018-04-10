package com.structures;

/**
 * @author Jose Romero
 * version 1.0.0
 */
public interface I_Process {
    boolean validarUsuario(String tarjeta, String clave);
    
    double consultar(String tarjeta);
    
    boolean depositar(String tarjeta);
    
        
}
