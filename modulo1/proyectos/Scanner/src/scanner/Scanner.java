package scanner;

public class Scanner {
    public static void main(String[] args) {
        // Declaración de las variables
        int edad = 0;
        int anio = 0;
        
        // Instancia de la clase Scanner
        java.util.Scanner scan = new java.util.Scanner(System.in);
        
        // Solicito por pantalla la edad al usuario
        System.out.print("Dame tu edad: ");
        
        // Capturando el dato ingresado por el usuario
        edad = scan.nextInt();
        
        // Realizando la operación para conocer la edad
        anio = 2017 - edad;
        
        // Presentando el resultado
        System.out.println("Naciste en el año: " + anio);
    }
}