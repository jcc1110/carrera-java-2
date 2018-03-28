package paquetesimports;
import paquetes.*;
import static paquetes.Paquetes.despedir;

public class PaquetesImports {
    public static void main(String[] args) {
        // Instanciando la clase Paquetes
        Paquetes pkg = new Paquetes();
        
        // Uso del método normal
        pkg.saludar();
        
        // Uso del método estático
        Paquetes.despedir();
        
        // Uso del método estático importado
        despedir();
    }
}
