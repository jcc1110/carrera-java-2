/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saime.controllers;

import com.saime.models.DataAccessUser;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import javax.servlet.http.HttpSession;


@Named(value = "lb")
@ApplicationScoped
public class LoginBean {
    
    //Atributos
    private String id;
    private String Usuario;
    private String Clave;
    
    //Metodos
    public HttpSession getCurrentSession(){
        return (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
    }
    
    
    public String login() {
        DataAccessUser Dt = new DataAccessUser();
        String resultado;
        if (Dt.userValidate(this.getUsuario(), this.getClave())) {
            resultado = "exito";
            HttpSession sesion = this.getCurrentSession();
            sesion.setAttribute("id", this.getId());
            
        }
        else
        {
            resultado = "error";
            FacesMessage fm = new  FacesMessage(FacesMessage.SEVERITY_WARN, "Usuario o contraseña incorrecta", "");
        }
        return  resultado;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }
    
    
    
}
