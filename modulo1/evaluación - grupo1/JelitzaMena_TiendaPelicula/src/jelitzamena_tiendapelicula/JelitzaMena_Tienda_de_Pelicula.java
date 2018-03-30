package jelitzamena_tiendapelicula;
import java.util.*;
import java.util.Arrays;
import jelitzamena_tiendapelicula.Peliculas;

/** Esta Clase es la Principal
 *@author Jelitza Mena
 *@version 1.0.0
 *@see MisExcepciones
 */

public class JelitzaMena_Tienda_de_Pelicula {


    public static void main(String[] args) {
        Peliculas peliculas = new Peliculas();
        peliculas.Peliculas();
        boolean salir = true;
        do{
        System.out.println("Bienvenido a la tienda de PELÍCULAS\n-----------------------------------------\n");
        System.out.println("Seleccione una opcion:");
        System.out.println("\t 1- Listar Peliculas.");
        System.out.println("\t 2- Buscar Pelicula.");
        System.out.println("\t 3- Agregar Pelicula.");
        System.out.println("\t 4- Modificar Pelicula.");
        System.out.println("\t 5- Eliminar Pelicula.");
        System.out.println("\t 6- Salir.\n");
        
    int opcion;
    int opcion2 = 0;
    int posicion;
    int x = 0;
    
    java.util.Scanner scan = new java.util.Scanner(System.in);
       
    //solicitamos lo que desea hacer el usuario
    System.out.println("Que opcion desea: ");
    opcion = scan.nextInt();
    //Metodo
        switch (opcion){
             case 1:
                System.out.println("Las peliculas Disponibles son: ");
                peliculas.getimprimir();
            break;
                case 2:
                    peliculas.getBuscar();
                    
                break;
                    case 3:
                        System.out.println("Ha seleccionado Agregar una Pelicula ");
                        peliculas.Agregar();
                        System.out.println("Pelicula agregada exitosomente");
                    break;    
                        case 4:
                            System.out.println("Ha seleccionado Modificar el registro de una Pelicula ");
                            peliculas.Modificar();
                            System.out.println("Modificacion Exitosa");
                        break;
                            case 5:
                                System.out.println("Ha seleccionado Eliminar una Pelicula ");
                                System.out.println("Lista de peliculas Cargadas ");
                                peliculas.getimprimir();
                                peliculas.Eliminar();
                                System.out.println("La pelicula ha sido eliminada exitosamente ");
                            break;
                                case 6:
                                System.out.println("Fin de Programa ");
                                salir = false;
                                break;
                            default:
                                    System.out.println("Opcion invalida");
                            break;
                            }
        }while (salir);
        System.out.println("Gracias por Visitarnos");
        
   
        }
        }
