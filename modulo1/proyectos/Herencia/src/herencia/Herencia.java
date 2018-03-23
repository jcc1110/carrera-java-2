package herencia;

public class Herencia {
    public static void main(String[] args) {
        // Clase Persona
        Persona persona = new Persona();                
        persona.setNombre("Jesus");
        persona.setApellido("Pico");
        
        // Presento los datos
        System.out.println(persona.getNombre());
        System.out.println(persona.getApellido());        
        System.out.println(persona.obtenerNombreCompleto());
        
        // Clase Empleado
        Empleado empleado = new Empleado();
        empleado.setNombre("Ricardo");
        empleado.setApellido("Perez");
        
        // Presento los datos
        System.out.println(empleado.setSueldo(9));        
        System.out.println(empleado.getNombre());
        System.out.println(empleado.getSueldo());
    }
}
