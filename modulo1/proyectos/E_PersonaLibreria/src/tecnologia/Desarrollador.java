package tecnologia;

public class Desarrollador {
    // Atributos
    private String lenguaje;
    private String ambiente;
    
    // Métodos
    public void saludar() {
        System.out.println("Hola soy un desarrollador");
    }
    
    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }
}
