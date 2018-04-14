package com.saime.structures;

/**
 * @author José Bautista
 * version 1.0.0
 */
public interface I_Process {
    boolean validarUsuario(String tarjeta, String clave);
    
    double consultar(String tarjeta);
    
    boolean depositar(String tarjeta);
    
        
}
