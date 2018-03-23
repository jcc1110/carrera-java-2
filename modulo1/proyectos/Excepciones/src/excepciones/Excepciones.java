package excepciones;

/**
 * Esta clase es la principal
 * @author Anthony Hurtado
 * @version 1.0.0
 * @see MiExcepcion
 */
public class Excepciones {
    public static void main(String[] args) {
        // Instancio la clase de Division
        Division div = new Division(11, 2);

        // Llamamos al método para operar y lo tratamos con el bloque try-catch-finally
        try {
            div.dividir();
        } catch(MiExcepcion me) {
            // Imprimo el mensaje de la excepciòn.
            System.out.println(me.getMessage());
            
            // Imprimo la ruta completa del error de principio a fin.
            //me.printStackTrace();
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Finalice la operación");
        }
    }
}
