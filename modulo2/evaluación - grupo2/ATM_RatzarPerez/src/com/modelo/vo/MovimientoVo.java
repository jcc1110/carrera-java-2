/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modelo.vo;

import com.estructura.InterfazMovimiento;

/**
 *
 * @author Ratzar
 */
public class MovimientoVo implements InterfazMovimiento {

    private Integer idUsuario; //size 11
    private String tipoMovimiento; //size 1
    private Double monto; // Decimal (11,2)

    @Override
    public Integer getIdUsuario() {
        return idUsuario;
    }

    @Override

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override

    public String getTipoMovimiento() {
        return tipoMovimiento;
    }

    @Override

    public void setTipoMovimiento(String tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    @Override

    public Double getMonto() {
        return monto;
    }

    @Override

    public void setMonto(Double monto) {
        this.monto = monto;
    }

}
