/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saime.controllers;

import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

/**
 *
 * @author evento
 */
@Named(value = "loginBean")
@ApplicationScoped
public class LoginBean implements Serializable{

     // Atributos
    private static final long serialVersionUID = 1L;
    private String usuario;
    private String clave;
    
    // Métodos
    public String login() {
             String resultado;        
        if ("anthony".equals(this.getUsuario().toLowerCase()) && 
                "123456".equals(this.getClave().toLowerCase())) {
            resultado = "resultado";
            HttpSession session = this.getCurrentSession();
            session.setAttribute("usuario", this.getUsuario());
            session.setAttribute("rol", "Administrador");
        } else {
            resultado = "error";
            FacesMessage fm = new FacesMessage(
                    FacesMessage.SEVERITY_ERROR, 
                    "Usuario o clave incorrectos", "ERROR");
            FacesContext.getCurrentInstance().addMessage(null, fm);            
        }        
        return resultado;
        
        
        
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
    public String logout() {
        HttpSession session = this.getSesionActual();
        session.removeAttribute("login");
        //session.removeAttribute("rol");
        session.invalidate();
        return "login";
    }

    private HttpSession getSesionActual() {
        return (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
    }

    private HttpSession getCurrentSession() {
        return (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
    }
    
}
