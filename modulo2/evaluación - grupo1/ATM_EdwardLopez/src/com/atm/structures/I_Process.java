/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atm.structures;
import com.atm.models.User;

/**
 *
 * @author Edward López
 */
public interface I_Process {
    //Validar Usuario
    public boolean validateUser(String card, String pass );
    //Método para hacer una consulta de saldo
    public boolean consultBalance(User user);
    //Método para hacer un deposito
    public boolean deposit(User user, String deposit);
    //Método para hacer un retiro
    public boolean retirement(User usuario, String retiro);
    //Método para cambiar la contraseña
    public boolean changePass(User user, String passNew);

    
 
    
    
}
