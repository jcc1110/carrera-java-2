
package com.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class DataAccessUser {

    //Atributo para establecer la Conexión a la Base de Datos
    Connection con;
    private String monto;

    public void connectToDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/atm", "root", "");            
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
        
    public boolean ValidateUser(Users usuario) {
        boolean result = false;
        String sql;
        
        try {
            this.connectToDB();            
            Statement sta = this.con.createStatement();
            sql = "SELECT * FROM usuario WHERE tarjeta='"+ usuario.getTarjeta() +"' AND clave='"+ usuario.getClave() +"'";
            ResultSet rs = sta.executeQuery(sql);                        

            while(rs.next()) {
                result=true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return result;
}    

   
  

public double consultar(Users usuario) {
        double result =0;
        String sql;
        
        try {
            this.connectToDB();            
            Statement sta = this.con.createStatement();
            sql = "SELECT saldo FROM usuario WHERE tarjeta='"+ usuario.getTarjeta() +"'";
            ResultSet rs = sta.executeQuery(sql);                        

            while(rs.next()) {
                return Double.parseDouble(rs.getString("saldo"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }        
        return result;
}    
public boolean depositar(Users usuario){
        int ID=0;
        String sql;
        double saldo=0.0;
        boolean depo=false;
        //obtener el id del cliente
        try {
            this.connectToDB();
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
}
    
     

