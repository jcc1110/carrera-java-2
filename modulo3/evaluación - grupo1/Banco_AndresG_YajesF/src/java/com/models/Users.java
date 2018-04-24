package com.models;

public class Users {
    private Integer idusuario;
    private String usuario;
    private String clave;
    private Integer idcliente;

    public Users() {
    }

    public Users(String usuario, String clave) {
    //public Users(Integer idusuario, String usuario, String clave, Integer idcliente) {
        this.idusuario = 0;
        this.usuario = usuario;
        this.clave = clave;
        this.idcliente = 0;
    }

    public Integer getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Integer getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Integer idcliente) {
        this.idcliente = idcliente;
    }
    
}
