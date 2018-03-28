package herencia;

public class Empleado extends Persona {
    // Atributos
    private int sueldo;
        
    // Métodos
    public String getSueldo() {
        String formato = "El sueldo de "+ super.getNombre();
        formato += ", " + super.getApellido();
        formato += " es " + this.sueldo;        
        return formato.toUpperCase();
    }
    
    public String setSueldo(int _sueldo) {
        String mensaje = "";
        if (_sueldo <= 10) {
            this.sueldo = _sueldo;
            mensaje = "Sueldo actualizado con éxito";
        } else {
            this.sueldo = 0;
            mensaje = "El sueldo no puedo ser superior a los Bs. 10,00";
        }
        return mensaje;
    }
}
