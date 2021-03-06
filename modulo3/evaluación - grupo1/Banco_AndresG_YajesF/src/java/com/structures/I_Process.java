/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.structures;
import com.models.Clients;

/**
 *
 * @author pc9
 */
public interface I_Process {
    
    public void RegistrarPersona();

    /**
     * Método ValidateUser
     * @return Método que permite Validar si el Usario es válido
     */
    public abstract boolean ValidateUser(String numcard, String pass);

    /**
     * Método GetBalance
     * @return Método que permite obtener el Balance
     */
    public abstract boolean GetBalance(Clients u);

    /**
     * Método Deposit
     * @return Método que permite realizar un Depósito
     */
    public abstract boolean Deposit(Double amount);

    /**
     * Método Retirement
     * @return Método que permite realizar un Retiro
     */
    public abstract boolean Retirement(Double amount);

    /**
     * Método KeyChange
     * @return Método que permite cambiar la contraseña del Usuario
     */
    public abstract boolean KeyChange(Clients u, String newpass);
    
}
