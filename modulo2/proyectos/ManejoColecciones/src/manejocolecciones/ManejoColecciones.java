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
        imprimir(empleados);
        
        // Conjunto de datos
        Set tareas = new HashSet();
        tareas.add("Limpiar mi cuarto");
        tareas.add("Sacar la basura");
        imprimir(tareas);
        
        // Mapa de clave:valor
        Map usuarios = new HashMap();
        usuarios.put(1, "anhurtado");
        usuarios.put(2, "pepe");
        imprimir(usuarios.keySet());
        imprimir(usuarios.values());
    }
    
    public static void imprimir(Collection coleccion) {
        // Recorro la colección e imprimo cada elemento
        for(Object elemento : coleccion) {
            System.out.println(elemento);
        }
        System.out.println("");
    }
}
