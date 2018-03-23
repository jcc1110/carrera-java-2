package excepciones;

/**
 * Construyendo mi propia excepción
 * @author Anthony Hurtado
 * @version 1.0.0
 */
public class MiExcepcion extends Exception {
    /**
     * Declaro mi constructor y llamo al constructor padre.
     * @param _mensaje 
     */
    public MiExcepcion(String _mensaje) {
        super(_mensaje);
    }
}
