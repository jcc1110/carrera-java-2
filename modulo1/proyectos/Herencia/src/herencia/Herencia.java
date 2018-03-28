package herencia;

public class Herencia {
    public static void main(String[] args) {
        // Clase Empleado
        Empleado empleado = new Empleado();
        empleado.setNombre("Ricardo");
        empleado.setApellido("Perez");
        
        // Presento los datos
        System.out.println(empleado.getNombre());
        System.out.println(empleado.getApellido());
        System.out.println(empleado.setSueldo(11));
        System.out.println(empleado.getSueldo());
    }
}
