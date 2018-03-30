package rrhh;

public class Empleado {
    // Atributos
    private String nombre;
    private String apellido;
    
    // Métodos
    public void saludar() {
        System.out.println("Hola soy un empleado");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
