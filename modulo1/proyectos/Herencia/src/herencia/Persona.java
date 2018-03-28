package herencia;

public class Persona {
    // Atributos de la clase
    private String nombre;
    private String apellido;
    
    // Métodos
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String _nombre) {
        this.nombre = _nombre.toUpperCase();
    }
    
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String _apellido) {
        this.apellido = _apellido.toUpperCase();
    }
    
    public String obtenerNombreCompleto() {
        return this.getNombre() + " " + this.getApellido();
    }
}
