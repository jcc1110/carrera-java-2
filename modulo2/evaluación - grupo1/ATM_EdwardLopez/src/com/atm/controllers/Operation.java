/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atm.controllers;

import com.atm.models.DataAccess;
import com.atm.models.User;
import com.atm.structures.I_Process;
import java.sql.Connection;
/**
 *
 * @author Edward
 */
public class Operation implements I_Process {

    @Override
    public boolean validateUser(String card, String pass) {
        // Instancia de las clases necesarias
        DataAccess bd = new DataAccess();
        User user = new User();
        // retornando el valor obtenido
        user.setCard(card);
        user.setPass(pass);
        // returnando el valor obtenido
        return bd.validate(user);
    }

    @Override
    public boolean consultBalance(User user) {
        //Obtener la conexión
        DataAccess bd = new DataAccess();
        //Retornar el Balance-Saldo del USER
        return bd.consultBalance(user);
    }

    @Override
    public boolean deposit(User user, String deposit) {
         DataAccess bd = new DataAccess();
        return bd.deposit(user, deposit); 
    }

    @Override
    public boolean retirement(User user, String retirement) {
        DataAccess bd = new DataAccess();
        //Retornar el Balance-Saldo del USER
        return bd.retirement(user, retirement);
    }

    @Override
    
    //Cambio de clave
    public boolean changePass(User user, String passNew) {
        DataAccess bd = new DataAccess();
        return bd.changePass(user, passNew);
    }

    

   

    
       
 
}
