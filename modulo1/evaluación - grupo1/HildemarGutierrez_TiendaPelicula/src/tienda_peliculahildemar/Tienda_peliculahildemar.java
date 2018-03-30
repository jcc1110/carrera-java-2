/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda_peliculahildemar;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author saime
 */
public class Tienda_peliculahildemar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        boolean opc=true;
        Scanner scan = new Scanner(System.in);
        
        while (opc){
        // Dando un mensaje de bienvenida
        System.out.println("Bienvenidos/as a la Tienda de Peliculas");        
        System.out.println("Opciones:");
        System.out.println("1 - Listar");
        System.out.println("2 - Buscar");
        System.out.println("3 - Eliminar");
        System.out.println("4 - Agregar");
        System.out.println("5 - Modificar");
        System.out.print("Indique una opción: ");
        
        // Esperando el dato
        opcion = scan.nextInt();
        
        
            
        // Evaluando la opción seleccionada
        switch(opcion) {
            case 1:
                lista lis = new lista();
                lis.listapelicula();
                break;
            case 2:
                lis.buscarpelicula();
                break;
            case 3:
                lis.eliminar();
                break;
            case 4:
                lis.agregar();
                break;
            case 5:
                lis.modificar();
                break;
            default:
                opc=false;
                break;
        }
        }
    }
    
}
