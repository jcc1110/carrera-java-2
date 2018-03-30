package tienda;

//**
/* Author Jose Romero
/* Tienda de Peliculas
/* Version 1.0.0
*/
import java.util.Scanner;



public class tienda {

    public static void main(String[] args) {
        int opcion;
        
        String agregar;
        String tp;
                 
        Scanner scan= new Scanner(System.in);
        Pelicula peli= new Pelicula();
        
        
       do { 
        peli.Opciones();
        
       
       
       switch (peli.opcion){
           case 1:
               peli.Añadir();
               peli.Listado();
           break;
           case 2:
               peli.Añadir();
                peli.BusquedaGenero();                
            break;                        
           case 3:
               peli.Añadir();
                peli.Agregar();
            break;
           case 4:
           peli.Modificacion();
          break;
           case 5:
            peli.Eliminar();
           break; 
           }
       System.out.println("Desea volver al menu principal? [s/n]: ");
       tp=scan.next();
       } while ("s".equals(tp));
       }
    }
    

