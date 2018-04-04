package genericos;

public class ClaseGenerica<T> {
    // Atributo generico
    T objeto;
    
    // Constructor
    public ClaseGenerica(T objeto) {
        this.objeto = objeto;
    }
    
    // Método para obtener el tipo de dato
    public void obtenerTipo() {
        System.out.println("El tipo T es: " + objeto.getClass().getName());
    }
}
