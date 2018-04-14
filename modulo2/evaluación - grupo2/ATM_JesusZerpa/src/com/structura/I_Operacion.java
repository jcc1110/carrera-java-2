package com.structura;

import com.models.Users;


public interface I_Operacion 
{
    public boolean ValidarUsuario(String NumTarj, String Password);
    
    public boolean ConsultaSaldo(Users u);
    
    public boolean Deposito(Users d);
    
    public boolean Retiro(Users r);
    
    public boolean CambioClave(Users C);
    
    //public abstract void GuardarLog();
    
}
