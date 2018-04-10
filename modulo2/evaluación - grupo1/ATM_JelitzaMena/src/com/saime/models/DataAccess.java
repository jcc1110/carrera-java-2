
package com.saime.models;
/**
 * @author Jelitza Mena
 * @version 1.0.0
 */
import java.sql.*;

public class DataAccess {
    /**
     * Definimos Atributos para la Conexion
     */ 
    Connection con;
    
  public void connectToDB() {
        /**
        * Establecemos conexion
        */
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/atm", "root", "");
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
}
    
    public boolean ValidarUsuario (Usuario usuario) {
        boolean result = false;
        String sql;
        
        /**
        * Establecemos conexion
        */
        try {
            this.connectToDB();            
            Statement sta = this.con.createStatement();
           /**
            * Ejecutamos Query para Validar Usuario
            */
            sql = "SELECT * FROM usuario WHERE tarjeta='"+ usuario.getTarjeta() +"' AND clave='"+ usuario.getClave() +"'";            
            ResultSet rs = sta.executeQuery(sql);                        
            while(rs.next()) {
                result = (rs.getString("tarjeta").equals(usuario.getTarjeta()) && rs.getString("clave").equals(usuario.getClave()));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return result;
    }
    
    public double ConsultaSaldo (Usuario usuario){
        Double result= 0.0;
        String sql;
           /**
            * Establecemos la conexion
            */
        try{
           this.connectToDB();            
            Statement sta = this.con.createStatement();
            /**
            * Ejecutamos Query para Consulta de Saldo
            */
            sql = "SELECT saldo FROM usuario WHERE tarjeta='"+usuario.getTarjeta()+"'";
            ResultSet rs = sta.executeQuery(sql);
            
             while(rs.next()) {
                result = rs.getDouble("saldo");
            }
            
        }catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return result;
    }
    
    public boolean deposito(Usuario usuario){
        int ID=0, saldonew=0;
        String sql;
        double saldo=0;
        boolean depo=false;
           /**
            * Establecemos Conexion
            */
        try{
            this.connectToDB();            
            Statement sta = this.con.createStatement();
            /**
            * Ejecutamos Query para Ubicar el ID del usuario
            */
            sql = "SELECT id FROM usuario WHERE tarjeta='"+usuario.getTarjeta()+"'";
            ResultSet rs = sta.executeQuery(sql);            
            while(rs.next()) {
                ID = rs.getInt("id");
            }            
           /**
            * Ejecutamos Query para ingresar el monto a depositar
            */
            int resultado = sta.executeUpdate("INSERT INTO movimiento (id_usuario, tipo_movimiento, monto) VALUES ("+ID+", 'I', "+usuario.getDeposito()+")");
            
           /**
            * Ejecutamos Query para verificar que el registro fue exitoso
            */
            if(resultado > 0) {
                sql = "SELECT saldo FROM usuario WHERE tarjeta='"+usuario.getTarjeta()+"'";
                ResultSet dep = sta.executeQuery(sql);        
                while(dep.next()) {
                   saldo = dep.getDouble("saldo");
                }
                /**
                 * Ejecutamos Query para actualizar el saldo en la BD
                 */
                saldo = saldo + usuario.getDeposito();
                saldonew = sta.executeUpdate("UPDATE usuario set saldo="+saldo+" where id='"+ID+"'");
                depo = true;
            } else {
                depo = false;
            }
        }catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return depo;
        
    }
    
    public boolean retiro(Usuario usuario){
        
        int ID=0, saldonew=0;
        String sql;
        double saldo=0;
        boolean depo=false;
        
        /**
         * Establecemos Conexion
         */    
        try{
            this.connectToDB();            
            Statement sta = this.con.createStatement();
            /**
             * Ejecutamos Query para ubicar el ID del Usuario
             */
            sql = "SELECT id FROM usuario WHERE tarjeta='"+usuario.getTarjeta()+"'";
            ResultSet rs = sta.executeQuery(sql);            
            while(rs.next()) {
                ID = rs.getInt("id");
            }   
            /**
             * Ejecutamos Query para ingresar el monto a retirar
             */    
            sql = "SELECT saldo FROM usuario WHERE tarjeta='"+usuario.getTarjeta()+"'";
                ResultSet dep = sta.executeQuery(sql);        
                while(dep.next()) {
                   saldo = dep.getDouble("saldo");
                }
            /**
             * Ejecutamos Query para verificar que el registro fue exitoso
             */    
            if(saldo > usuario.getRetiro()){
                   
            /**
             * Ejecutamos Query para insertar el registro del retiro
             */ 
            int resultado = sta.executeUpdate("INSERT INTO movimiento (id_usuario, tipo_movimiento, monto) VALUES ("+ID+", 'E', "+usuario.getRetiro()+")");
            
            /**
             * Ejecutamos Query para verificar que el registro fue exitoso
             */
                saldo = saldo - usuario.getRetiro();
                saldonew = sta.executeUpdate("UPDATE usuario set saldo="+saldo+" where id='"+ID+"'");
                depo = true;
            } else {
                depo = false;
            }
        }catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return depo;
        
    }
    
}
