package com.control;

import com.modelo.Usuario;
import com.modelo.BaseDatoAccess;
import com.structura.I_Operacion;

public class Operacion implements I_Operacion{

    @Override
    public boolean Validar(String NumTarje, String Clave) {
        
        BaseDatoAccess data = new BaseDatoAccess();
        Usuario usuar = new Usuario();
        
        
        usuar.setNumTarje(NumTarje);
        usuar.setClave(Clave);
        
        
        return data.Validar(usuar);

    }

    @Override
    public boolean ConsultarSaldo(Usuario Consu) {
        
        BaseDatoAccess data = new BaseDatoAccess();
        
        return data.ConsultaCuenta(Consu);

    }

    @Override
    public boolean Deposito(Usuario Depo) {
        
        BaseDatoAccess data = new BaseDatoAccess();
        
        return data.Deposito(Depo);

    }

    @Override
    public boolean Retiro(Usuario ret) {
        
        BaseDatoAccess data = new BaseDatoAccess();
        return data.Retiro(ret);

    }

    @Override
    public boolean CambioClave(Usuario Camb) {
        
        BaseDatoAccess data = new BaseDatoAccess();
        
        return data.CambioClave(Camb);

    }
    
}
