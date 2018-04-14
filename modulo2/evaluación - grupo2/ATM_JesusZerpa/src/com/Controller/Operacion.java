package com.Controller;
import com.models.DataAccess;
import com.models.Users;
import com.structura.I_Operacion;


public class Operacion implements I_Operacion{


    @Override
    public boolean ValidarUsuario(String NumTarj, String Password) {
                
        // Instancia de las clases necesarias
        DataAccess bd = new DataAccess();
        Users U = new Users();
        
        // retornando el valor obtenido
        U.setNumTarj(NumTarj);
        U.setPassword(Password);
        
        // retornando el valor obtenido
        return bd.Validar(U);

    }

    @Override
    public boolean ConsultaSaldo(Users u) {
        
        //Obtener la conexión
        DataAccess bd = new DataAccess();
        
        //Retornar los datos de la cuenta
        return bd.ConsultaCuenta(u);
        
    }

    @Override
    public boolean Deposito(Users d) {
        
        DataAccess bd = new DataAccess();
        return bd.Deposito(d);

    }

    @Override
    public boolean Retiro(Users r) {
        
        DataAccess db = new DataAccess();
        return db.Retiro(r);
        
    }

    @Override
    public boolean CambioClave(Users C) {
        
        DataAccess db = new DataAccess();
        return db.CambioClave(C);
        
    }
}
