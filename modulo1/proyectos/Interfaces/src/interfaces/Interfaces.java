package interfaces;

public class Interfaces {
    public static void main(String[] args) {
        // Instanciando mi clase ConexionOracle
        ConexionOracle cnn = new ConexionOracle();
        
        // Llamando a los métodos necesarios
        cnn.conectar();
        cnn.desconectar();
        cnn.listar();
        cnn.setServiceName("xe");
        System.out.println(cnn.getServiceName());
    }
}
