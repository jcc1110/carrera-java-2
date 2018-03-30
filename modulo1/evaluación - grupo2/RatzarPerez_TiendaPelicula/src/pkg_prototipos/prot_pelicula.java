/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg_prototipos;

/**
 *
 * @author Ratzar
 */

// clase abstracta 
// tiene los atributos de pelicula
public abstract class prot_pelicula {

    
    
    //definicion de variables
    private String varPeliculaNombre;
    private int varPeliculaCodigo;
    private int varPeliculaStock;
    
    //metodos constructor
    
    public prot_pelicula() {
        this.varPeliculaNombre = "";
        this.varPeliculaCodigo = 0;
        this.varPeliculaStock = 0;
    }
    public prot_pelicula(String varPeliculaNombre, int varPeliculaCodigo, int varPeliculaStock) {
        this.varPeliculaNombre = varPeliculaNombre;
        this.varPeliculaCodigo = varPeliculaCodigo;
        this.varPeliculaStock = varPeliculaStock;
    }
    //metodos getter y setter
    public String getVarPeliculaNombre() {
        return varPeliculaNombre;
    }

    public void setVarPeliculaNombre(String varPeliculaNombre) {
        this.varPeliculaNombre = varPeliculaNombre;
    }
   

    public int getVarPeliculaCodigo() {
        return varPeliculaCodigo;
    }

    public void setVarPeliculaCodigo(int varPeliculaCodigo) {
        this.varPeliculaCodigo = varPeliculaCodigo;
    }
   
    public int getVarPeliculaStock() {
        return varPeliculaStock;
    }

    public void setVarPeliculaStock(int varPeliculaStock) {
        this.varPeliculaStock = varPeliculaStock;
    }
    
    
    
    
}
