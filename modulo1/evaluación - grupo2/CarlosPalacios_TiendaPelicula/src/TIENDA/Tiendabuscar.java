/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TIENDA;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Tiendabuscar {
     /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // TODO code application logic here
        char res;
		int opcion;
		Scanner lector=new Scanner(System.in);
		int codigo=0;
        int pelicula;
        String peliculaseleccionado;
        
        //Instanciando la clase Scanner
        java.util.Scanner scan = new java.util.Scanner(System.in);
        //solicito datos del usuario
        System.out.print("Bienvenidos a la Tienda de Peliculas por favor coloque la numero de la pelicula a buscar :" );
        //capturando el valor ingresado
        pelicula = scan.nextInt();
       
                 
             
	
        //Establezco mi estrucctura de control y evaluo la variable pelicula
        switch (pelicula){
            case 1: peliculaseleccionado = "Casa Blanca codigo 001285"; break;
            case 2: peliculaseleccionado = "Titanic codigo 002112"; break;
            case 3: peliculaseleccionado = "Matrix cofigo 003545"; break;
            case 4: peliculaseleccionado = "Avengers  codigo 002563" ; break;
            case 5: peliculaseleccionado = "El Conjuro codigo 003692"; break;
            case 6: peliculaseleccionado = "El Exorcista  codigo 00968"; break;
            case 7: peliculaseleccionado = "El Padrino  codigo 006235"; break;
            default: peliculaseleccionado =" No se envuentra esa pelicula"; break;
            
            
        }
                
        
        
        System.out.println(peliculaseleccionado);
        
    }
    
}

