/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estructura;

public interface InterfazUsuario {
 
    public Integer getId();
    
    public void setId(Integer id);

    public String getTarjeta();

    public void setTarjeta(String tarjeta);

    public String getClave();

    public void setClave(String clave);

    public Double getSaldo();

    public void setSaldo(Double saldo);

}
