
package michellefericelli_tpeliculas;
import java.util.*;

/**
 *version 1.0.0
 * @author Michelle
 */
public class MichelleFericelli_TPeliculas {

    /**
     * @param args the command line arguments
     */
    
  
    public static void main(String[] args) {
        //variables necesarias
        int op;
        //instancia de la clase Scanner
        Scanner scan = new Scanner(System.in);
        Operaciones operaciones = new Operaciones();
        
    do{
        //Menu de las opciones
        System.out.println("MENU DE OPCIONES");
        System.out.println("1 - Listar pelicula");
        System.out.println("2 - Buscar pelicula");
        System.out.println("3 - Agregar pelicula");
        System.out.println("4 - Modificar pelicula");
        System.out.println("5 - Eliminar pelicula");            
        System.out.println("6 - SALIR DEL PROGRAMA");

        System.out.print("Seleccione su opción: ");
        //
        op = scan.nextInt();
        
        //
        switch(op){
            
            case 1: 
                operaciones.listarPeliculas(operaciones.a.peliculas);
               //  System.out.println(peliculas.get(x));
                //listarPeliculas();
               break;
            case 2:
                operaciones.BuscarPeliculas(operaciones.a.peliculas);
                break;
            case 3:
                operaciones.AgregarPeliculas(operaciones.a.peliculas);
                break;
            case 4:
                operaciones.ModificarPeliculas(operaciones.a.peliculas);
                break;
            case 5:
                operaciones.EliminarePeliculas(operaciones.a.peliculas);
                break; 
            default:
                System.out.println("No se eligio ninguna opción");
                break;
            }
        }while(op!=6);
    }      
}

