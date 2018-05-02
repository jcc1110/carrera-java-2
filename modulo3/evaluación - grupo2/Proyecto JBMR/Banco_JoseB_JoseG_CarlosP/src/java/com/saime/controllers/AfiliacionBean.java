package com.saime.controllers;
import com.saime.models.afiliado;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;

@Named(value = "persona")
@ApplicationScoped
public class AfiliacionBean implements Serializable {
    // Variable para identificar vistas
    private static final long serialVersionUID = 1L;
    
    // Atributos
    private String nombre;
    private String apellido;
    private int cuenta;
    private String correo;
    private int cedula;
    private List<afiliado> lstafi;

    public AfiliacionBean() {
        this.lstafi = new ArrayList();
        this.lstafi.add(new afiliado("Jose", "Espinoza", 546521, "jose@gmail.com", 55485));
        this.lstafi.add(new afiliado("Peter", "Parker", 456545, "peterpark@gmail.com", 879542));
    }

    public List<afiliado> getLstafi() {
        return lstafi;
    }

    public void setLstafi(List<afiliado> lstafi) {
        this.lstafi = lstafi;
    }

    public void nuevoAfiliado() {
        this.lstafi.add(new afiliado(this.getNombre(),this.getApellido(),this.getCuenta(),this.getCorreo(),this.getCedula()));
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    
   
}