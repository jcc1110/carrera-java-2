package clases;
import java.util.*;

public class Clases {
    public static void main(String[] args) { 
        // Variables necesarias
        String mayus;
        boolean esMayus;
        
        // Instancio la clase Persona
        Persona persona = new Persona();
        Scanner scan = new Scanner(System.in);
        
        // Pregunto los datos
        System.out.print("Indique su nombre: ");
        persona.nombre = scan.next();        
        System.out.print("Indique su apellido: ");
        persona.apellido = scan.next();        
        System.out.print("Indique el año de su cumpleaños: ");
        persona.cumpleanos = scan.nextInt();
        System.out.print("¿Quiere su nombre en mayúscula? (S/N): ");
        mayus = scan.next();
        
        // Valido la opción
        esMayus = ("S".equals(mayus));
        
        // Muestro los valores
        System.out.println("Completo completo: " + persona.obtenerNombreCompleto(esMayus, false));
        System.out.println("Edad: " + persona.obtenerEdad());
    }
}
