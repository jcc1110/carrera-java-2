package manejocolecciones;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ManejoColecciones {
    public static void main(String[] args) {
        // Lista estructurada de datos
        List empleados = new ArrayList();
        empleados.add("Anthony Hurtado");
        empleados.add("Pepe Mujica");
        recorrer(empleados);
        
        // Conjunto de datos
        Set tareas = new HashSet();
        tareas.add("Limpiar mi cuarto");
        tareas.add("Sacar la basura");
        recorrer(tareas);
        
        // Mapa de clave:valor
        Map usuarios = new HashMap();
        usuarios.put("s24dafszf", "anhurtado");
        usuarios.put("asda96341", "pepe");
        recorrer(usuarios.keySet());
        recorrer(usuarios.values());
    }
    
    public static void recorrer(Collection coleccion) {
        // Recorro la colección e imprimo cada elemento
        
        // Programación funcional
        coleccion.forEach(elemento -> System.out.println(elemento.toString().toUpperCase()));
        coleccion.forEach(System.out::println);
        
        // Programación imperativa
        for(Object elemento : coleccion) {
            System.out.println(elemento);
        }
        System.out.println("");
    }
}
