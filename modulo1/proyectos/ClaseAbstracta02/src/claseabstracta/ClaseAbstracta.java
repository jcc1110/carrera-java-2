package claseabstracta;

public class ClaseAbstracta {
    public static void main(String[] args) {
        // Instanciando la clase AccesoDatosMySQL
        AccesoDatosMySQL adm = new AccesoDatosMySQL();
        AccesoDatosOracle ado = new AccesoDatosOracle();
        
        // Llamando al método dibujar
        System.out.println(adm.conectar());
        System.out.println(adm.consultar("SELECT * FROM persona"));
        System.out.println(adm.desconectar());
        System.out.println("");
        System.out.println(ado.conectar());
        System.out.println(ado.consultar("SELECT * FROM persona"));
        System.out.println(ado.desconectar());
    }
}
