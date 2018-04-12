package concurrencia;

public class HiloContador extends Thread {
    // Atributos
    Contador contador;

    // Constructor
    public HiloContador(String name, Contador counter) {
        // Llamo al constructor de la clase padre (Thread) y le paso el nombre del hilo
        super(name);
        this.contador = counter;
    }
    
    // Implemento el método run() de la clase padre (Thread)
    @Override
    public void run() {
        try {
            String mensaje;
            for (int i=0; i<10; i++) {
                // Variable necesaria
                int valorContador;
                
                // Decorador para sincronizar la ejecución de los hilos
                synchronized(this.contador) {
                    // Obtengo el valor actual del objeto
                    valorContador = this.contador.getContador();
                    
                    // Detengo por un 1 milisegundo la ejecución del hilo
                    Thread.sleep(1000);
                    
                    // Establezco el valor de la propiedad
                    this.contador.setContador(valorContador + 1);
                    
                    // Imprimo el valor actual
                    mensaje = "Hilo: "+ super.getName() +" / ";
                    mensaje += "Prioridad: "+ super.getPriority() +" / ";
                    mensaje += "Contador: "+ valorContador;
                    System.out.println(mensaje);
                }
            }
        } catch (InterruptedException e) {
            // Muestro el mensaje de la excepción producida
            System.out.println(e.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}