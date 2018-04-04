package expresioneslambda;

public class ExpresionesLambda {
    public static void main(String[] args) {
        // Variables
        int resultado;
        
        // Instancia de la clase Aritmetica
        Aritmetica arit = new Aritmetica();
        resultado = arit.sumar(3, 2);
        System.out.println("Resultado: " + resultado);
        
        // Uso de la Expresión Lambda
        Operacion op = (x, y) -> (x + y);
        resultado = op.sumar(3, 2);
        System.out.println("Resultado (Lambda): " + resultado);
    }
}
