package com.structura;

import com.modelo.Usuario;


public interface I_Operacion {
    
    public boolean Validar(String NumTarje, String Clave);
    
    public boolean ConsultarSaldo(Usuario Consu);
    
    public boolean Deposito(Usuario Depo);
    
    public boolean Retiro(Usuario ret);
    
    public boolean CambioClave(Usuario Camb);
    
   // public boolean GuardarLog();
    
}
