package conexion;
import java.sql.*;

public class Conexion {
    public static void main(String[] args) {        
        try {
            // Incluyendo la libreria al proyecto
            System.out.println("Conectando...");
            Class.forName("com.mysql.jdbc.Driver");

            // Realizando la conexión a la base de datos
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/APP", "app", "");
            System.out.println("Conexión exitosa");

            // Preparando una consulta
            Statement sta = con.createStatement();
            
            // Consulta a la base de datos
            ResultSet rs = sta.executeQuery("SELECT * FROM Usuario");

            // Recorriendo el resultado
            while(rs.next()) {
                // Imprimiento cada registro
                System.out.println(rs.getInt("id") + " - " + rs.getString("nombre") + " - " + rs.getString("clave"));
            }
            
            // Creando un nuevo registro en la BD
            int resultado = sta.executeUpdate("INSERT INTO Usuario (id, nombre, clave) VALUES (2, 'admin', '123456789')");
            System.out.println("Resultado: " + resultado);
        } catch (SQLException se) {
            System.out.println(se.getMessage());
        } catch (ClassNotFoundException ce) {
            System.out.println(ce.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
