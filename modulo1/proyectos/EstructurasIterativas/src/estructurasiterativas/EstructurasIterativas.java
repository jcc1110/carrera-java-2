package estructurasiterativas;

public class EstructurasIterativas {
    public static void main(String[] args) {
        // Declarando mi variable
        int a = 1;
        
        // Estructura Iterativa "While"
        while (a < 5) {
            // Imprimo el valor
            System.out.println("El valor es: "+ a);
            
            // Incremento el valor de la variable "a" en 1
            a++; // a = a + 1; 
        }
        
        // Estructura Iterativa "DoWhile"
        do {
            System.out.println("El valor es: "+ a + " desde DoWhile");
        } while(a < 5);
        
        // Estructura Iterativa "For"
        for (int i = 1; i <= 10; i++) {
            System.out.println("For #" + i);
        }
    }
}