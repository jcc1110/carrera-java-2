package arreglos;
import java.util.ArrayList;

public class Arreglos {
    public static void main(String[] args) {
        // Primera forma de declarar un arreglo
        String[] nombres = {"Anthony", "Ricardo", "Ana", "Petra"};
        int[] numeros = {1, 2, 3};
        
        // Segunda forma de declarar un arreglo, valor entre corchetes es la longitud que tendrá el arreglo
        String[] apellidos = new String[2];
        apellidos[0] = "Hurtado";
        apellidos[1] = "Perez";
        
        // Mostrando los valores
        System.out.println(nombres[2] + " " + apellidos[1] + " " + numeros[2]);
        System.out.println(""); 
        
        /* ========================================== */

        // Instancia mi clase ArrayList
        ArrayList<String> arreglo = new ArrayList<>();
        
        // Agrego un elemento al arreglo
        arreglo.add("Anthony");
        arreglo.add("Ruben");
        arreglo.add("Pedro");
        
        // Mostrando los valores      
        System.out.println("La cantidad de elementos del arreglo son: " + arreglo.size());
        System.out.println("Valor en la posición 1: " + arreglo.get(1));
        
        // Eliminando un registro
        arreglo.remove(2);
        
        // Mostrando el arreglo completo
        System.out.println(arreglo);
    }
}