/**
 * Clase de Inicio (Main).
 */
package tiendadepeliculas;

import java.util.Scanner;
import operaciones.operaciones;

/**
 *
 * @author jesus zerpa
 */
public class TiendaDePeliculas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        operaciones oper = new operaciones();
        TiendaDePeliculas tp = new TiendaDePeliculas();
        Scanner scan = new Scanner(System.in);
        int opcion;

        oper.llenarArray();  //Llena el Array List de Películas
        do {
            System.out.println("1) Listar Películas");
            System.out.println("2) Buscar Película");
            System.out.println("3) Agregar Película");
            System.out.println("4) Modificar Película");
            System.out.println("5) Eliminar Película");
            System.out.println("6) Salir");
            System.out.print("Elija una opción (del 1 al 6): ");
            opcion=scan.nextInt();
            
            if (opcion>=1&&opcion<=6)
            {
                switch(opcion)
                {
                    case 1:
                        oper.MostrarPeliculas();
                    break;
                    case 2:
                        oper.BuscarPelicula();
                    break;
                    case 3:
                        oper.AgregarPelicula();
                    break;
                    case 4:
                        oper.ActualizarPelicula();
                    break;
                    case 5:
                        oper.EliminarPelicula();
                    break;
                    default:
                         System.out.println("Ha elegido una opcion invalida");
                    break;
                }
            }
        }while(opcion!=6);        
    }
   
}
