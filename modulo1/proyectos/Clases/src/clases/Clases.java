package clases;
import java.util.Scanner;

public class Clases {
    public static void main(String[] args) { 
        // Variables necesarias
        String mayus;
        boolean esMayus;
        
        // Instancio la clase Persona
        Persona p1 = new Persona();
        Persona p2 = new Persona("Pepito", "Pregunton", 1982);
        Scanner scan = new Scanner(System.in);
        
        // Presento los datos
        System.out.println(p2.nombre);
        System.out.println(p2.apellido);
        System.out.println(p2.cumpleanos);
        System.out.println(p2.obtenerNombreCompleto());
        System.out.println(p2.obtenerEdad());
        System.out.println(""); 
        
        // Pregunto los datos
        System.out.print("Indique su nombre: ");
        p1.nombre = scan.next();        
        System.out.print("Indique su apellido: ");
        p1.apellido = scan.next();        
        System.out.print("Indique el año de su cumpleaños: ");
        p1.cumpleanos = scan.nextInt();
        System.out.print("¿Quiere su nombre en mayúscula? (S/N): ");
        mayus = scan.next();
        
        // Valido la opción
        esMayus = ("S".equals(mayus));        
        /*if ("S".equals(mayus)) {
            esMayus = true;
        } else {
            esMayus = false;
        }*/
        
        // Muestro los valores
        System.out.println("Tu nombre completo es: " + p1.obtenerNombreCompleto(esMayus, false));
        System.out.println("Tu edad es: " + p1.obtenerEdad());
    }
}
