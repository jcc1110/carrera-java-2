package home;

import java.util.Scanner;

/**
 * Punto de entrada de la tienda de películas
 * @author Anthony Hurtado
 * @version 1.0.0
 */
public class EntryPoint {

    /**
     * @param args Argumentos iniciales
     */
    public static void main(String[] args) {
        // Variables necesarias
        int opcion;
        Scanner scan = new Scanner(System.in);
        
        // Dando un mensaje de bienvenida
        System.out.println("Bienvenidos/as a la Tienda de Peliculas");        
        System.out.println("Opciones:");
        System.out.println("1 - Listar");
        System.out.println("2 - Buscar");
        System.out.println("3 - Agregar");
        System.out.println("4 - Modificar");
        System.out.println("5 - Eliminar");
        System.out.print("Indique una opción: ");
        
        // Esperando el dato
        opcion = scan.nextInt();
        
        // Evaluando la opción seleccionada
        switch(opcion) {
            case 1:
                
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            case 4:
                
                break;
            case 5:
                
                break;
            default:
                
                break;
        }
    }  
}