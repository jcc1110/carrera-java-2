package claseabstracta;

public abstract class BaseDeDatos {
    // Atributos
    public String usuario = "admin";
    public String clave = "12345";
    
    // Método para conectar a la base de datos
    public abstract boolean conectar();
    
    // Método para consultar datos
    public abstract String consultar(String sql);
    
    // Método para desconectar a la base de datos
    public abstract boolean desconectar();
}