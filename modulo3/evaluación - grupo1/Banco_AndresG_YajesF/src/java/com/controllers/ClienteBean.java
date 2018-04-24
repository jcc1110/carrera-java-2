/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controllers;

import com.models.Clients;
import com.models.DataAccessClients;
import com.models.DataAccessUser;
import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import javax.servlet.http.HttpSession;
//import javax.faces.context.FacesContext;
//import javax.servlet.http.HttpSession;

/**
 *
 * @author pc12
 */
@Named(value = "cb")
@ApplicationScoped
public class ClienteBean implements Serializable {
    // Atributos
    private static final long serialVersionUID = 1L;
    private Integer icliente;
    private Integer cedula;
    private String nombres;
    private String apellidos;
    private String telefonos;
    private String correo;
    private double saldo;
    private Clients client;
    private DataAccessClients dac;

//    public ClienteBean() {
//        
//    }

    public Clients getClients() {
        return client;
    }

    public void setClients(Clients client) {
        this.client = client;
    }

    public DataAccessClients getDac() {
        return dac;
    }

    public void setDac(DataAccessClients dac) {
        this.dac = dac;
    }

    public Integer getIcliente() {
        return icliente;
    }

    public void setIcliente(Integer icliente) {
        this.icliente = icliente;
    }

    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(String telefonos) {
        this.telefonos = telefonos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public Clients MostrarDatos(){
        HttpSession session = this.getSesionActual();
        dac.GetClient((int) session.getAttribute("usuario"));
//        HttpSession session = this.getSesionActual();
//        session.setAttribute("usuario", this.getUsuario());
//        session.setAttribute("rol", "Administrador");
        
        return client;
    }
//    public HttpSession getSesionActual() {
//        return (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
//    }

    private HttpSession getSesionActual() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
