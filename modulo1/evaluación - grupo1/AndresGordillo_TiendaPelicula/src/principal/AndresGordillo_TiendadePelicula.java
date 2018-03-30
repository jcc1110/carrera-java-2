/**
 * @author Andrés Gordillo
 * Clase Principal donde se ejecuta el programa (MAIN)
 */
package principal;
import java.util.*;
import operaciones.operaciones;


public class AndresGordillo_TiendadePelicula {
    /**
     * @param args the command line arguments
     */
    ArrayList<String> peliculas = new ArrayList();

    public static void main(String[] args) {
        // TODO code application logic here
        AndresGordillo_TiendadePelicula obj = new AndresGordillo_TiendadePelicula();
        Scanner lectura = new Scanner(System.in);
        operaciones op = new operaciones();
        int opcion=0;

        obj.llenarArray();  //Llena el Array List de Películas
        do {
            System.out.println("-------------------------------------------");
            System.out.println("Bienvenidos a la Tienda de Películas (JAVA)");
            System.out.println("-------------------------------------------");
            System.out.println("1) Listar Películas");
            System.out.println("2) Buscar Películas");
            System.out.println("3) Agregar Películas");
            System.out.println("4) Modificar Películas");
            System.out.println("5) Eliminar Películas");
            System.out.println("6) Salir del Programa");
            System.out.print("Elija su opción (presione Enter): ");
            opcion=lectura.nextInt();
            
            if (opcion<1||opcion>6)
                System.out.println("OPCIÓN INVÁLIDA POR FAVOR SELECCIONE NUEVAMENTE");
            else
            {
                try{
                    switch(opcion)
                    {
                        case 1:
                            op.listarPeliculas(obj.peliculas);
                        break;
                        case 2:
                            op.BuscarPelicula(obj.peliculas);
                        break;
                        case 3:
                            op.AgregarPelicula(obj.peliculas);
                        break;
                        case 4:
                            op.ModificarPelicula(obj.peliculas);
                        break;
                        case 5:
                            op.EliminarPelicula(obj.peliculas);
                        break;
                        default:
                             System.out.println("Ha realizado una selección inválida");
                        break;
                    }
                }
                catch(clases.excepciones e){
                    System.out.println(e.getMessage());
                }
            }
            
        }while(opcion!=6);
    }
    
    private void llenarArray()
    {
        peliculas.add("Titanic");
        peliculas.add("Buscando al Soldado Ryan");
        peliculas.add("La Vida es Bella");
        peliculas.add("El Pianista");
        peliculas.add("La Guerra de las Galaxias");
        peliculas.add("El Señor de los Anillos");
        peliculas.add("En Busca de La Felicidad");
        peliculas.add("Matrix");
        peliculas.add("La Guerra de los Mundos");
        peliculas.add("Inteligencia Artificial");        
    }
    
}
