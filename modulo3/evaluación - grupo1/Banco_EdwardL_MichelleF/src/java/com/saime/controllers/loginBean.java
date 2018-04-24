/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saime.controllers;

import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import com.saime.models.DataAccessUser;


/**
 *
 * @author pc4
 */
@Named(value = "loginBean")
@ApplicationScoped
public class loginBean {

    //Atributos
    private static final long serialVersionUID = 1L;
    private String id;
    private String password;
    
    public HttpSession getCurrentSession() {
        return (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
    }
    
    public String login()
    {
        DataAccessUser da = new DataAccessUser();
        String information;
        if (da.userValidate(this.getId(), this.getPassword()))
        {
            information = "success";
            HttpSession session = this.getCurrentSession();
            session.setAttribute("id", this.getId());
        } 
        else
        {
            information = "error";
            FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_WARN, "Usuario o Contraseña incorreta", "");
            FacesContext.getCurrentInstance().addMessage(null, fm);            
        }

        return information;
    }

    public String getId() {
        return id;
    }
   
    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
