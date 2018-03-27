package scanner;

public class Scanner {
    public static void main(String[] args) {
        // Declaración de las variables
        int edad;
        int anio;
        String nombre;
        
        // Instancia de la clase Scanner
        java.util.Scanner scan = new java.util.Scanner(System.in);
        
        // Solicito por pantalla el nombre al usuario
        System.out.print("Dame tu nombre: ");        
        // Capturando el dato ingresado por el usuario
        nombre = scan.next();
        /*if (!nombre.matches("[a-zA-Z]+")) {
            System.out.println("El nombre solo debe contener letras");
        }*/
        
        // Solicito por pantalla la edad al usuario
        System.out.print("Dame tu edad: ");        
        // Capturando el dato ingresado por el usuario
        edad = scan.nextInt();
        
        // Realizando la operación para conocer la edad
        anio = 2018 - edad;
        
        // Presentando el resultado
        System.out.println("Hola, " + nombre + " naciste en el año " + anio);
    }
}