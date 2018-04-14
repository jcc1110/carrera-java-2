package com.structures;

import com.models.Users;


public interface I_Process {
    
    /**
     * Método ValidateUser
     * @return Método que permite Validar si el Usario es válido
     */
    public abstract boolean ValidateUser(String numcard, String pass);

    /**
     * Método GetBalance
     * @return Método que permite obtener el Balance
     */
    public abstract double GetConsultar(String tarjeta);

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
    public abstract boolean KeyChange(Users u, String newpass);

    
}