/**
 * @author Andrés Gordillo
 * Clase donde se definen las Interfaces para Agregar, Modificar y Eliminar
 */
package interfaces;

import java.util.ArrayList;

public interface IOperaciones {

    // Métodos a implementar
    public abstract void AgregarPelicula(ArrayList array) throws clases.excepciones;    
    public abstract void ModificarPelicula(ArrayList array) throws clases.excepciones;
    public abstract void EliminarPelicula(ArrayList array) throws clases.excepciones;    
}
