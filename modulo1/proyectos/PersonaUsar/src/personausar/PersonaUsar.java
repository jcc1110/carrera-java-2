package personausar;
import rrhh.Empleado;
import tecnologia.Desarrollador;

public class PersonaUsar {
    public static void main(String[] args) {        
        // Instanciar las clases
        Desarrollador desa = new Desarrollador();
        Empleado emp = new Empleado();
        
        // Usar los métodos
        desa.saludar();
        emp.saludar();
    }
}
