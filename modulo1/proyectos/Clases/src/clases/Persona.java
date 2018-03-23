package clases;

public class Persona {
    // Atributos
    public String nombre;
    public String apellido;
    public int cumpleanos;
    
    // Constructor #01
    public Persona() { }
    
    // Constructor #02
    public Persona(String firstname, String lastname, int birthdate) {
        this.nombre = firstname;
        this.apellido = lastname;
        this.cumpleanos = birthdate;
    }
    
    // Métodos
    public String obtenerNombreCompleto(boolean mayus, boolean minus) {
        String cadena = this.nombre +" "+ this.apellido;        
        if (mayus == true) {
            cadena = cadena.toUpperCase();
        } else if (minus == true) {
            cadena = cadena.toLowerCase();
        }         
        return cadena;
    }
    
    public int obtenerEdad() {
        return 2018 - this.cumpleanos;
    }
}
