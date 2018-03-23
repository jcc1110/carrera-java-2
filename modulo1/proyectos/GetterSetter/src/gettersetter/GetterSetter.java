package gettersetter;

public class GetterSetter {
    public static void main(String[] args) {
        // Instancia mi clase Persona
        Persona persona = new Persona("Anthony","Hurtado",27);
        
        // Cambiando los valores
        persona.setNombre("Pedro");
        persona.setApellido("Lopez");
        persona.setEdad(25);
        
        // Presento los datos
        System.out.println(persona.getNombre());
        System.out.println(persona.getApellido());
        System.out.println(persona.getEdad());  
    }
}
