package claseabstracta;

public class ClaseAbstracta {
    public static void main(String[] args) {
        // Instanciando la clase AccesoDatos
        AccesoDatos ad = new AccesoDatos();
        
        // Llamando al método dibujar
        System.out.println(ad.conectar());
        System.out.println(ad.consultar("SELECT * FROM persona"));
        System.out.println(ad.desconectar());
    }
}
