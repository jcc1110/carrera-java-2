package claseabstracta;

public class ClaseAbstracta {
    public static void main(String[] args) {
        // Instancia mi clase Circulo
        Circulo circulo = new Circulo();
        
        // Utilizo los métodos implementados
        System.out.println("El area de un circulo es: " + circulo.calcularArea(2, 5));
        circulo.dibujar();
    }    
}
