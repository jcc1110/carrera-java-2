package com.models;

public class ClientAccount {
    private String idcuenta;
    private Integer idcliente;
    private Integer idestado;

    public ClientAccount() {
    }

    public ClientAccount(String idcuenta, Integer idcliente, Integer idestado) {
        this.idcuenta = idcuenta;
        this.idcliente = idcliente;
        this.idestado = idestado;
    }

    public String getIdcuenta() {
        return idcuenta;
    }

    public void setIdcuenta(String idcuenta) {
        this.idcuenta = idcuenta;
    }

    public Integer getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Integer idcliente) {
        this.idcliente = idcliente;
    }

    public Integer getIdestado() {
        return idestado;
    }

    public void setIdestado(Integer idestado) {
        this.idestado = idestado;
    }


}
