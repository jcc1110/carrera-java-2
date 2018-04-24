/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modelo.vo;

import com.estructura.InterfazUsuario;

/**
 *
 * @author Ratzar
 */
public class UsuarioVo implements InterfazUsuario{
    private Integer id; //size 11
    private String tarjeta; //size 5
    private String clave; //size 5
    private Double saldo; // decimal (10,2)

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String getTarjeta() {
        return tarjeta;
    }

    @Override
    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }

    @Override
    public String getClave() {
        return clave;
    }

    @Override
    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public Double getSaldo() {
        return saldo;
    }

    @Override
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    
    
    
}
