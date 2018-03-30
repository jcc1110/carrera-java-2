/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package michellefericelli_tpeliculas;
import java.util.*;
//import java.util.ArrayList;
//import java.util.Scanner;
/**
 *version 1.0.0
 * @author Michelle
 */
public abstract class Peliculas {
    //atributos
    String nombre;
    private String posicion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
     public String getPosicion() {
        return posicion;
    }
    
     public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

   public abstract void listarPeliculas(ArrayList pelis);
   public abstract void BuscarPeliculas(ArrayList pelis);
   public abstract void AgregarPeliculas(ArrayList pelis);
   public abstract void ModificarPeliculas(ArrayList pelis);
   public abstract void EliminarePeliculas(ArrayList pelis);

    

   
     
}


