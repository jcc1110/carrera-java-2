package externo;
import paquetes.*;
import static paquetes.Paquetes.despedir;
import static paquetes.Persona.saludarPersona;

public class Externo {
    public static void main(String[] args) {
        // Instanciando la clase Paquetes
        Paquetes pkg = new Paquetes();
        
        // Uso del método normal
        pkg.saludar();
        System.out.println("");
        
        // Uso del método estático
        Paquetes.despedir();
        System.out.println("");
        
        // Uso del método estático importado
        despedir();
        saludarPersona();
    }
}
