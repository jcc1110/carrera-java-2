package com.models;

import java.sql.Date;

public class Moves {
    private int idmovimiento;
    private String idcuenta;
    private String idtipomov;
    private Date fecha;
    private Double monto;

    public Moves() {
    }

    public Moves(int idmovimiento, String idcuenta, String idtipomov, Date fecha, Double monto) {
        this.idmovimiento = idmovimiento;
        this.idcuenta = idcuenta;
        this.idtipomov = idtipomov;
        this.fecha = fecha;
        this.monto = monto;
    }

    public int getIdmovimiento() {
        return idmovimiento;
    }

    public void setIdmovimiento(int idmovimiento) {
        this.idmovimiento = idmovimiento;
    }

    public String getIdcuenta() {
        return idcuenta;
    }

    public void setIdcuenta(String idcuenta) {
        this.idcuenta = idcuenta;
    }

    public String getIdtipomov() {
        return idtipomov;
    }

    public void setIdtipomov(String idtipomov) {
        this.idtipomov = idtipomov;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    
    
}
