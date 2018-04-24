package com.modelo.dao;

import com.controlador.MiAplicacion;
import com.controlador.MiControlador;
import com.modelo.conexion.Conexion;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Ratzar
 */
public class UsuarioDao {
//Variable para almacenar el nombre del Controlador de la clase

    private MiControlador miControlador;

//███████████████████████████████████████████████
//Metodo que Relaciona la clase UsuarioDao con el Controlador    
    public void setCoordinador(MiControlador miControlador) {
        this.miControlador = miControlador;
    }

//███████████████████████████████████████████████
    /**
     * metodo utilizado para consultar datos en la base de datos si el usuario
     * existe en la tabla usuario
     */
//    public boolean usuarioConsultarExiste(String miTarjeta) {
//       
//
//    }
    public boolean tarjetaConsultarExiste(String tarjeta1) {
        boolean existe = false;

//creo una variable de clase tipo Connection de Sql
//        Connection miConnection = null;
//creo un objeto/instancia del tipo de mi clase Conexion del paquete com.modelo.conexion
        Conexion miConexion = new Conexion();
        //        
        /**
         * .getConection me retorna una conexion con la base de datos, return el
         * objeto Conection de la Clase Conexion que se creo al instanciar la
         * clase conexion con la base de datos
         */

        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet result = null;

        connection = miConexion.getConnection();

        String consulta = "SELECT * FROM usuario where tarjeta= ? ";

        try {
            if (connection != null) {
                statement = connection.prepareStatement(consulta);
                statement.setString(1, tarjeta1);
                result = statement.executeQuery();
                if (result.next() != false) {
                    existe = true;
                }

            }
            miConexion.desconectar();
        } catch (SQLException e) {
            System.out.println("Error en la consulta del usuario: " + e.getMessage());
        }
        JOptionPane.showMessageDialog(null, "UsuarioDao --> existe tarjeta = " + existe);

        miConexion.desconectar();

        return existe;

    }

//███████████████████████████████████████████████
    public boolean validarDatosLogin(String tarjeta1, String clave1) {
        boolean existe = false;

//creo una variable de clase tipo Connection de Sql
//        Connection miConnection = null;
//creo un objeto/instancia del tipo de mi clase Conexion del paquete com.modelo.conexion
        Conexion miConexion = new Conexion();
        //        
        /**
         * .getConection me retorna una conexion con la base de datos, return el
         * objeto Conection de la Clase Conexion que se creo al instanciar la
         * clase conexion con la base de datos
         */

        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet result = null;

        connection = miConexion.getConnection();

        String consulta = "SELECT * FROM usuario where (tarjeta = ?) AND (clave = ?) ";

        try {
            if (connection != null) {
                statement = connection.prepareStatement(consulta);
                statement.setString(1, tarjeta1);
                statement.setString(2, clave1);
                result = statement.executeQuery();
//                JOptionPane.showMessageDialog(null,result.next()+"\n"+tarjeta1+"\n"+clave1);
                if (result.next() == true) {
//                    while(result.next()){
                    MiAplicacion.sessionTarjeta = result.getString("tarjeta");
                    MiAplicacion.sessionId = result.getInt("id");
                    MiAplicacion.sessionMensaje = "Usuario Id: " + MiAplicacion.sessionId + " Tarjeta Nro.: " + MiAplicacion.sessionTarjeta;
                    existe = true;
                    System.out.println(MiAplicacion.sessionTarjeta + " --- " + MiAplicacion.sessionId);
//                    }
                    existe = true;
                }

            }
            miConexion.desconectar();
        } catch (SQLException e) {
            System.out.println("Error en la consulta del usuario: " + e.getMessage());
        }
//        JOptionPane.showMessageDialog(null, "UsuarioDao validar --> usuario existe = "+existe);

//MiAplicacion.sessionTarjeta --> variable global para almacenar datos del usuario que hizo login valido
//cerramos la conexion con la base de datos        
        miConexion.desconectar();

        return existe;

    }

//███████████████████████████████████████████████
    public Double consultarSaldo() {

        int usuarioId = MiAplicacion.sessionId;
        Double sumaIngresos = 0.0;
        Double sumaEgresos = 0.0;
        boolean existe = false;

///////////////////////////////////////////////////////////////////
        sumaIngresos = consultarMovimientosUsuario(usuarioId, "I"); // I = Ingreso
        sumaEgresos = consultarMovimientosUsuario(usuarioId, "E"); // E = Egresos

        return (sumaIngresos - sumaEgresos);

    }

//███████████████████████████████████████████████    
    public Double consultarMovimientosUsuario(int usuarioId1, String tipoMovimiento1) {
        Double devolverSuma = -1.0;

//creo una variable de clase tipo Connection de Sql
//        Connection miConnection = null;
//creo un objeto/instancia del tipo de mi clase Conexion del paquete com.modelo.conexion
        Conexion miConexion = new Conexion();
        //        
        /**
         * .getConection me retorna una conexion con la base de datos, return el
         * objeto Conection de la Clase Conexion que se creo al instanciar la
         * clase conexion con la base de datos
         */

        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet result = null;

        connection = miConexion.getConnection();

        String consulta = " SELECT  usuario.id,  movimiento.tipo_movimiento,  SUM(movimiento.monto) AS SUMA_MONTO "
                + "FROM   usuario  INNER JOIN movimiento ON (usuario.id = movimiento.id_usuario) "
                + "WHERE   usuario.id = ? AND   movimiento.tipo_movimiento = ? "
                + "GROUP BY   usuario.id,   movimiento.tipo_movimiento";

        try {
            if (connection != null) {
                statement = connection.prepareStatement(consulta);
                statement.setInt(1, usuarioId1);
                statement.setString(2, tipoMovimiento1); //  I = Ingresos E = Egresos
                result = statement.executeQuery();

                if (result.next() == true) {

                    devolverSuma = result.getDouble("SUMA_MONTO");
                }

            }
            miConexion.desconectar();
        } catch (SQLException e) {
            System.out.println("Error en la consulta del usuario: " + e.getMessage());
        }

        miConexion.desconectar();

        return devolverSuma;
    }
//███████████████████████████████████████████████

    public boolean insertarDeposito(Double num1) {
        String resultado = "";
        boolean aprobado = false;

//creo una variable de clase tipo Connection de Sql
//        Connection miConnection = null;
//creo un objeto/instancia del tipo de mi clase Conexion del paquete com.modelo.conexion
        Conexion miConexion = new Conexion();
        //        
        /**
         * .getConection me retorna una conexion con la base de datos, return el
         * objeto Conection de la Clase Conexion que se creo al instanciar la
         * clase conexion con la base de datos
         */

        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet result = null;

        connection = miConexion.getConnection();

        String consulta = "INSERT INTO movimiento(id_usuario,  tipo_movimiento,  monto) VALUES(  ?,  ?,  ?)";

        try {
            if (connection != null) {
                statement = connection.prepareStatement(consulta);
                statement.setInt(1, MiAplicacion.sessionId);
                statement.setString(2, "I");
                statement.setDouble(3, num1);
                statement.execute();
                aprobado = true;
            }

        } catch (SQLException e) {
            System.out.println("Error en la insersion del registro" + e.getMessage());
        }

        miConexion.desconectar();

        return aprobado;

    }

    public boolean insertarRetiro(Double num1) {
          String resultado = "";
        boolean aprobado = false;

//creo una variable de clase tipo Connection de Sql
//        Connection miConnection = null;
//creo un objeto/instancia del tipo de mi clase Conexion del paquete com.modelo.conexion
        Conexion miConexion = new Conexion();
        //        
        /**
         * .getConection me retorna una conexion con la base de datos, return el
         * objeto Conection de la Clase Conexion que se creo al instanciar la
         * clase conexion con la base de datos
         */

        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet result = null;

        connection = miConexion.getConnection();

        String consulta = "INSERT INTO movimiento(id_usuario,  tipo_movimiento,  monto) VALUES(  ?,  ?,  ?)";

        try {
            if (connection != null) {
                statement = connection.prepareStatement(consulta);
                statement.setInt(1, MiAplicacion.sessionId);
                statement.setString(2, "E");
                statement.setDouble(3, num1);
                statement.execute();
                aprobado = true;
            }

        } catch (SQLException e) {
            System.out.println("Error en la operacion del retiro" + e.getMessage());
        }

        miConexion.desconectar();

        return aprobado;
    }

    public boolean actualizarClave(Integer num2) {
             String resultado = "";
        boolean aprobado = false;

//creo una variable de clase tipo Connection de Sql
//        Connection miConnection = null;
//creo un objeto/instancia del tipo de mi clase Conexion del paquete com.modelo.conexion
        Conexion miConexion = new Conexion();
        //        
        /**
         * .getConection me retorna una conexion con la base de datos, return el
         * objeto Conection de la Clase Conexion que se creo al instanciar la
         * clase conexion con la base de datos
         */

        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet result = null;

        connection = miConexion.getConnection();

        String consulta = "UPDATE  usuario SET  clave = ? WHERE   usuario.id = ?";

        try {
            if (connection != null) {
                statement = connection.prepareStatement(consulta);
                statement.setString(1, num2.toString());
                statement.setInt(2, MiAplicacion.sessionId);
                statement.executeUpdate();
                aprobado = true;
            }

        } catch (SQLException e) {
            System.out.println("Error en la operacion de actualizar clave" + e.getMessage());
        }

        miConexion.desconectar();

        return aprobado;
        
        
        
    }
}
