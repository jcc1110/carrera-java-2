/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg_inicio;

import pkg_prototipos.prot_pelicula;

/**
 *
 * @author Ratzar
 */
public class class_pelicula extends prot_pelicula{

    
    public void mostrarDatos(){
        System.out.println("Código: " + this.getVarPeliculaCodigo()+ "\n Nombre : " + this.getVarPeliculaNombre() + "\n Stock : " + this.getVarPeliculaStock());
    }
}
