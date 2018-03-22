package arreglos;
import java.util.ArrayList;

public class Arreglos {
    public static void main(String[] args) {
        // Primera forma de declarar un arreglo
        String[] nombres = {"Anthony", "Ricardo", "Ana", "Petra"};
        
        // Segunda forma de declarar un arreglo, valor entre corchetes es la longitud que tendrá el arreglo
        String[] apellidos = new String[2];
        apellidos[0] = "Hurtado";
        apellidos[1] = "Perez";
        
        // Instancia mi clase ArrayList
        ArrayList<String> arreglo = new ArrayList<>();
        
        // Agrego un elemento al arreglo
        arreglo.add("Anthony");
        arreglo.add("Ruben");
        
        // Mostrando los valores
        System.out.println(nombres[0] + " " + apellidos[0]);        
        System.out.println("La cantidad de elementos del arreglo son: " + arreglo.size());
        System.out.println("Valor en la posición 1: " + arreglo.get(1));
        
        // Limpiando el arreglo
        arreglo.clear();
        
        // Mostrando el arreglo completo
        System.out.println(arreglo);
    }
}