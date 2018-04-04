package concurrencia;

public class Concurrencia {
    public static void main(String[] args) {
        // Creo un objeto Contador
        Contador contador = new Contador(); 
        
        // Creo dos objeto de tipo HiloContador
        HiloContador h1 = new HiloContador("PrimerHilo", contador);
        HiloContador h2 = new HiloContador("SegungoHilo", contador);
        
        // Inicio cada hilo
        h1.start();
        h2.start();
    }
}
