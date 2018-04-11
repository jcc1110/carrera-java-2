package clasesanidadas;

// Clase Principal
public class Operaciones {
    // Atributos
    static int c = 10;
    int d = 11;
    Suma suma = new Suma();
    
    // Constructor
    public Operaciones() {
        System.out.println("Hola desde el constructor");
        suma.saludar();
    }
    
    // Clase Anidada
    public static class Suma {
        // Atributos
        private int a;
        private int b;
        
        // Métodos
        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }

        public int getB() {
            return b;
        }

        public void setB(int b) {
            this.b = b;
        }
        
        public int calcular() {
            System.out.println("Valor interno: " + c);
            
            Operaciones op = new Operaciones();
            System.out.println("Clase externa: " + op.d);            
            
            return this.getA() + this.getB();
        }
        
        public void saludar() {
            System.out.println("Hola desde Sumar");
        }
    }
    
    public class Resta {}
    
    public class Multiplicacion {}
}
