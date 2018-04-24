package com.controllers;
import com.DataBase.DataAccessUser;
import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

@Named(value = "lg")
@ApplicationScoped
public class LoginBean implements Serializable {
    
    // Variable para identificar vistas
    private static final long serialVersionUID = 1L;
    
    // Atributos
    private String username;
    private String password;
    private int id;
    
    
    
    public LoginBean() {
    }

    

    public LoginBean(String username, String password) {
        
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public HttpSession getCurrentSession() {
        return (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
    }
    
    
    public String login()
    {
        DataAccessUser da = new DataAccessUser();
        String information;
        if (da.UserValidate(this.getUsername(), this.getPassword()))
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

    
    
}
