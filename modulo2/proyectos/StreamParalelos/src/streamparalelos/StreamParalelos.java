package streamparalelos;
import java.util.ArrayList;
import java.util.List;

public class StreamParalelos { 
    public static void main(String[] args) {
        // Creo un arreglo de tipo entero
        List<Integer> numeros = new ArrayList();
        
        // Añado al arreglo los números del 1 al 5
        for (int i=0; i<5; i++) {
            numeros.add(i);
        }
        
        // Muestro los números por el stream() común
        numeros.stream().forEach(System.out::println);
        
        // Separo los resultados
        System.out.println("========");
        
        // Muestro los números por el parallelStream()
        numeros.parallelStream().forEach(System.out::println);
    }
}
