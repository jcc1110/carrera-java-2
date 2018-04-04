package manejoarchivos;
import static manejoarchivos.Archivos.*;

public class ManejoArchivos {
    public static void main(String[] args) {
        // Ruta del archivo
        String ruta = "./log.txt";
        
        // Operaciones con el archivo
        crear(ruta);
        System.out.println("");
        
        escribir(ruta);
        System.out.println("");
        
        leer(ruta);
        System.out.println("");
        
        anexar(ruta);
        System.out.println("");
        
        leer(ruta);
        System.out.println("");
    }
}
