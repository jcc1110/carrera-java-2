package streams;
import java.util.ArrayList;
import java.util.List;

public class Streams {
    public static void main(String[] args) {
        // Definio una lista de tipo String        
        List<String> lista = new ArrayList();
        lista.add("Anthony");
        lista.add("Candy");
        lista.add("Terry");
        lista.add("Carlos");
        
        // Utilizo los filtros Streams
        System.out.println("Busco los nombres que comiencen con la letra C");
        lista.stream()
                .filter(x -> x.startsWith("C"))
                .forEach(System.out::println);
        System.out.println("");
        
        // Ordeno la lista
        System.out.println("Se ordena la lista");
        lista.stream()
                .sorted()
                .forEach(x -> System.out.println(x));
        System.out.println("");
        
        // Recorro y manipulo la lista
        System.out.println("Manipula cada elemento");
        lista.stream()
                .map(String::toUpperCase)
                .forEach(x -> System.out.println(x));
        System.out.println("");
        
        // Limitar resultados
        System.out.println("Limito los resultados");
        lista.stream()
                .limit(2)
                .forEach(x -> System.out.println(x));
        System.out.println("");
        
        // Contar elementos
        System.out.println("Cantidad de elementos");
        System.out.println(lista.stream().count());
    }
}
