/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendadepeliculas4;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Tiendadepeliculaseliminar {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   //declaramos la variables
		char res;
		int opcion;
		Scanner lector=new Scanner(System.in);
		int codigo=0;
                System.out.println("Bienvenidos a la Tienda de Peliculas por favor coloque la numero O para escoger una opciíon y continuar :");
        // Esperando el dato
        Scanner scan = new Scanner(System.in);
        opcion = scan.nextInt();
        
        System.out.println("Opciones:");
        System.out.println("1 - Listar de peliculas");
        System.out.println("2 - Buscar pelicula");
        System.out.println("3 - Agregar pelicula");
        System.out.println("4 - Modifica pelicular");
        System.out.println("5 - Eliminar pelicula");
        System.out.print("Indique una opción: ");
        
        switch(opcion) {
        
        // Evaluando la opción seleccionada
        
            case 1: break;
                
                
            case 2:  break;
                
               
            case 3: break;
                
                
            case 4: break;
                
               
            case 5: break;
                
                
            default: break;
                
                
            
        }
		do{
			System.out.print("Codigo de la pelicula a eliminar: ");
			codigo=lector.nextInt();
			
			
			System.out.print("Desea eliminar esta pelicula? ");
			res=lector.next().charAt(0);
		}while(res!='s');
		//Ahora los resultados
		System.out.println("La pelicula ha sido eliminada con exito " );
		
	}
}
