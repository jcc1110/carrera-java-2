
package com.saime.models;
import java.sql.*;
/**
 * @author José Bautista
 * version 1.0.0
 */
public class DataAccess {
    //Atributo
    Connection con;
    
    public void conexionDB(){
        try{
            //incluyo la libreria al proyecto
            Class.forName("com.mysql.jdbc.Driver");
            this.con= DriverManager.getConnection("jdbc:mysql://localhost:3306/atm", "root", "");
            } catch (SQLException | ClassNotFoundException ex) {
                System.out.println(ex.getMessage());
                }
    } 
    // Acceso para validar usuario
    public boolean validar(User usuario){
        boolean result= false;
        String sql;
        try {
            this.conexionDB();
            //Preparo la consulta
            Statement sta = con.createStatement();
            sql = "SELECT * FROM usuario WHERE tarjeta='"+ usuario.getTarjeta() +"' AND clave='"+ usuario.getClave() +"'";
            ResultSet rs = sta.executeQuery(sql);
            while(rs.next()) {
                result = (rs.getString("tarjeta").equals(usuario.getTarjeta()) && rs.getString("clave").equals(usuario.getClave()));
            }
        } catch (SQLException se){
            System.out.println(se.getMessage());
                           
            }
        return result;
            
        }
    
    public double consultar(User usuario){
        
        String sql;
        double result= 0.0;
        try {
            this.conexionDB();
            //Preparo la consulta
            Statement sta = con.createStatement();
            sql = "SELECT saldo FROM usuario WHERE tarjeta='"+ usuario.getTarjeta() +"'";
            ResultSet rs = sta.executeQuery(sql);
            while(rs.next()) {
                result = rs.getDouble("saldo");
            }
        } catch (SQLException se){
            System.out.println(se.getMessage());
                           
            }
        return result;
        
    }
    //Acceso para el deposito
    public boolean depositar(User usuario){
        int ID=0;
        String sql;
        double saldo=0.0;
        boolean depo=false;
        //obtener el id del cliente
        try {
            this.conexionDB();
            //Preparo la consulta
            Statement sta = this.con.createStatement();
            sql = "SELECT * FROM usuario WHERE tarjeta='"+ usuario.getTarjeta() +"'";
            ResultSet rs = sta.executeQuery(sql);
            while(rs.next()) {
                ID = rs.getInt("id");
                saldo = rs.getDouble("saldo");
            }
            //insertar el registro del deposito
            int resultado = sta.executeUpdate("INSERT INTO movimiento (id_usuario, tipo_movimiento, monto) VALUES ("+ID+",'I', "+usuario.getDeposito() +")");
            
            // verificar que el registro fue exitoso
            if(resultado > 0) {
                saldo = saldo + usuario.getDeposito();
                resultado = sta.executeUpdate("UPDATE usuario SET saldo="+saldo+" WHERE id="+ID);
                depo = (resultado > 0);
            } else {
                depo = false;
            }
        } catch (SQLException se){
            System.out.println(se.getMessage());              
        }
        return depo;
    }

        // Acceso para el retiro
     public boolean retirar(User usuario){
        int ID=0;
        String sql;
        double saldo=0.0;
        boolean reti=true;
        //obtener el id del cliente
        try {
            this.conexionDB();
            //Preparo la consulta
            Statement sta = this.con.createStatement();
            sql = "SELECT * FROM usuario WHERE tarjeta='"+ usuario.getTarjeta() +"'";
            ResultSet rs = sta.executeQuery(sql);
            while(rs.next()) {
                ID = rs.getInt("id");
                saldo = rs.getDouble("saldo");
            }
            //insertar el registro del deposito
            int resultado = sta.executeUpdate("INSERT INTO movimiento (id_usuario, tipo_movimiento, monto) VALUES ("+ID+",'E', "+usuario.getRetiro()+")");
            
            // verificar que el registro fue exitoso
            if(resultado > 0) {
                saldo = saldo - usuario.getRetiro();
                resultado = sta.executeUpdate("UPDATE usuario SET saldo="+saldo+" WHERE id="+ID);
                reti = (resultado > 0);
            } else {
                reti = false;
            }
        } catch (SQLException se){
            System.out.println(se.getMessage());              
        }
        return reti;
    }



}
