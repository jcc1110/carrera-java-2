package genericos;

public class Genericos {
    public static void main(String[] args) {
        // Generico de Tipo integer
        ClaseGenerica<Integer> cg = new ClaseGenerica<>(20);
        cg.obtenerTipo();
        
        // Generico de Tipo cadena
        ClaseGenerica<String> cg2 = new ClaseGenerica<>("AH");
        cg2.obtenerTipo();

        // Generico de Tipo double
        ClaseGenerica<Double> cg3 = new ClaseGenerica<>(3.14);
        cg3.obtenerTipo();
    }
}
