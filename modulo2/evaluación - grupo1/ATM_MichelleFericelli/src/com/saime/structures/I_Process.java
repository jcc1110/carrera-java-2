/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saime.structures;

import com.saime.controllers.Operation;
import com.saime.models.DataAccess;


/**
 *version 1.0.0
 * @author Michelle
 */
public interface I_Process {
    
    //
    public abstract boolean ingresar(Operation connectToDB);
    public abstract boolean consultaSaldo(Operation connectToDB, String balance);
    public abstract boolean deposito (DataAccess connectToDB, String balance);
    public abstract boolean retiro (DataAccess connectToDB, String retiro);
    public abstract boolean cambioClave(DataAccess connectToDB, String nuevaclave);
    
}
