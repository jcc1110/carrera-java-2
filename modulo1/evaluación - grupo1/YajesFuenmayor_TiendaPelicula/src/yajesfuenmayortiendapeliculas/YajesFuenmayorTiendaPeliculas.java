/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yajesfuenmayortiendapeliculas;
import java.util.*;

/**
 *
 * @author Yajes Fuenmayor
 */
public class YajesFuenmayorTiendaPeliculas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        int op;
        
        arregloPeliculas pel = new arregloPeliculas();
        
        pel.peliculas();
        
        do {
        
            System.out.println("Tienda de Películas, Elija su opcion:");
            System.out.println("1.- Mostar las Películas de la lista");
            System.out.println("2.- Buscar una Película de la lista");
            System.out.println("3.- Agregar una nueva Película");
            System.out.println("4.- Modificar una Película existente");
            System.out.println("5.- Eliminar una  Película de la lista");
            System.out.println("6.- Salir");
            System.out.println("Su Opción es:");


        op = scan.nextInt();
        
        
        switch(op)
        {
            case 1:
                pel.Imprimir();
            break;
            
            case 2:
                pel.Buscar();           
            break;                  
        
            case 3:
                pel.Agregar();
            break;                  
            
            case 4:
                pel.Imprimir();
                pel.Modificar();
            break; 
            
            case 5:
                pel.Imprimir();
                pel.Eliminar();
            break; 
    }
        } while (op!=6);
    
}
}
