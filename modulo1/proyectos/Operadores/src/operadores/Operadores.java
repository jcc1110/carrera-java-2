package operadores;

public class Operadores {
    public static void main(String[] args) {
        // Declaración de las variables necesarias
        int a = 12;
        int b = 2;
        int c = a - b; // 10
        System.out.println("Resultado inicial: " + c);
        
        // Utilizando el operador *= para multiplicar el (valor actual * valor actual)
        c *= c;
        
        // Presentación de los valores
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + (a / b));
        System.out.println("Módulo: " + (a % b));
        System.out.println("Resultado multiplicado: " + c);
        System.out.println("Cáculo del IVA (12%): " + (a + b + c) * 12 / 100);       
    }
}