package com.controllers;
import com.models.DataAccessUser;
import com.models.Users;
import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
//import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

@Named(value = "ub")
@ApplicationScoped
public class UsuarioBean implements Serializable {
    // Atributos
    private static final long serialVersionUID = 1L;
    private String usuario;
    private String clave;
    Users user;
    DataAccessUser dau;

    // Métodos
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
    
    public String login() {
        String resultado;        
        user = new Users(this.getUsuario().toLowerCase(),this.getClave().toLowerCase());
        dau = new DataAccessUser();
        if (dau.ValidateUser(user)){
            resultado = "exito";
            HttpSession session = this.getSesionActual();
            session.setAttribute("usuario", this.getUsuario());
            //session.setAttribute("rol", "Administrador");
        } else {
            resultado = "error";
//            FacesMessage fm = new FacesMessage(
//                    FacesMessage.SEVERITY_ERROR, 
//                    "Usuario o contraseña incorrectos", "Error");
//            FacesContext.getCurrentInstance().addMessage(null, fm);            
        }        
        return resultado;
    }
    
    public String logout() {
        HttpSession session = this.getSesionActual();
        session.removeAttribute("usuario");
        //session.removeAttribute("rol");
        session.invalidate();
        return "login";
    }
    
    public HttpSession getSesionActual() {
        return (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
    }
}
