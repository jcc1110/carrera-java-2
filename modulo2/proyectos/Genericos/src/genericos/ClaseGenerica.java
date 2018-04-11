package genericos;

public class ClaseGenerica<T> {
    // Atributo generico
    T objeto;
    
    // Constructor
    public ClaseGenerica(T _objeto) {
        this.objeto = _objeto;
    }
    
    // Método para obtener el tipo de dato
    public void obtenerTipo() {
        System.out.println("T es: " + this.objeto.getClass().getName());
    }
}
