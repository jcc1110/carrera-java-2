/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edwardexamen;
import java.util.*;
/**
 *
 * @author Edward_Jr
 */
public class EdwardExamen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int opcion;
       
        //Instancia del ArrayList
       
        Listado list = new Listado();
        //Escanner
        Scanner scan = new Scanner(System.in);
        //OPCION = Criterio del Menú
        
        
        list.Peliculas();
        
        do {
            // Menú
            System.out.println("Bienvenido, ¿Qué desea hacer?");        
            System.out.println("1) - Ver Listado");
            System.out.println("2) - Busqueda");
            System.out.println("3) - Agregar");
            System.out.println("4) - Modificar");
            System.out.println("5) - Eliminar");
            System.out.println("6) - Salir");
            System.out.print("Favor elegir una opción: " +"\n" );

            //Opción del Swithc(Menú)

            opcion = scan.nextInt();      

            switch(opcion)
            {
                //Imprimir la lista actual de Películas
                case 1:
                list.Listar();
                break;
                //Encontrar disponibilidad de una Película
                case 2:
                //list.Peliculas();
                list.Buscar();
                break;
                //Agregar
                case 3:
                list.Agregar();
                break;
                //Modificar
                case 4:
                //list.Peliculas();
                list.Modificar();
                //list.getImprimir();

                break;

                case 5:
                list.Eliminar();
                break;
            }
        } while (opcion!=6);
        
     }
    
}
