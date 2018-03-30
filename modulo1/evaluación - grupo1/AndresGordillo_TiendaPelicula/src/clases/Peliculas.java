/**
 * @author Andrés Gordillo
 * Clase donde se establecen los métodos abstractos para Listar y Buscar
 */
package clases;
import java.util.*;

public abstract class Peliculas {
    
    //Método para listar las Películas
    public abstract void listarPeliculas(ArrayList array) throws excepciones;

    //Método para buscar las Películas
    public abstract void BuscarPelicula(ArrayList array) throws excepciones;
    
}
