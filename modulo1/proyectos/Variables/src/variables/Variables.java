package variables;

public class Variables {
    // Declaración de mis variables globales
    static byte a = 10;
    static Integer c = 2;
    
    // Declaración de una constante
    static final double pi = 3.14;

    public static void main(String[] args) {
        // Declaración de mi variable local
        int b = 1;
        
        // Presentación de los valores
        System.out.println("El valor de mi variable global es: " + a);
        System.out.println("El valor de mi variable local es: " + b);
        System.out.println("El valor de mi variable referencial es: " + c.compareTo(b));
        System.out.println("El valor de mi constante es: " + pi);
        
        // Modificar mi variable global
        a = 12;
        
        // Modificar mi variable local
        b = 11;
        System.out.println("El valor de mi variable local es: " + b);
        
        // Realizando una llamada a un método
        saludar();
    }
    
    public static void saludar() {
        // Declaración de mi variable local
        int b = 15;
        
        // Presentación de los valores
        System.out.println("El valor de mi variable global es: " + a);
        System.out.println("El valor de mi variable local es: " + b);
    }
}
