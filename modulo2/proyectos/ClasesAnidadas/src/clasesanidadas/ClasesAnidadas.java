package clasesanidadas;

public class ClasesAnidadas {
    public static void main(String[] args) {
        // Instancia de la clase anidada
        Operaciones.Suma suma = new Operaciones.Suma();

        // Estableciendo las propiedades
        suma.setA(3);
        suma.setB(4);

        // Imprimiendo los valores
        System.out.println("Resultado: " + suma.calcular());
    }
}
