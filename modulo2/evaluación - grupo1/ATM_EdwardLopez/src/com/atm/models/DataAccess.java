/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atm.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Edward López
 */
public class DataAccess {
    
   // Atributo
    Connection con;
    //Módulo para la Conexión
    public void connectDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/atm", "root", "");
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
       //Validación 
    public boolean validate(User user) {
        boolean result = false;
        String sql;
        
        try {
            this.connectDB();            
            Statement sta = this.con.createStatement();
            sql = "SELECT * FROM usuario WHERE tarjeta='"+ user.getCard() +"' AND clave='"+ user.getPass() +"'";            
            ResultSet rs = sta.executeQuery(sql);                        
            while(rs.next()) {
                result = (rs.getString("tarjeta").equals(user.getCard()) && rs.getString("clave").equals(user.getPass()));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return result;
    }
    
    
    
    //Módulo para consultar Saldo
     public boolean consultBalance(User user) {
        //Consulta de Saldo 
        boolean result = false;
        String sql;
        try {
            //Acá se intenta establecer la conexión a la DB
            this.connectDB();
            Statement sta = this.con.createStatement();
            sql = "SELECT * FROM usuario WHERE tarjeta='"+ user.getCard() +"' AND clave='"+ user.getPass() +"'";
            //Ejecutar la QUERY SQL
            ResultSet rs = sta.executeQuery(sql);            
            while(rs.next()) {
                System.out.println(rs.getInt("id") + " - " + rs.getString("tarjeta") + " - " + rs.getString("clave") + " - " + rs.getString("saldo"));
                //Mostrar por ventana
                JOptionPane.showMessageDialog(null, "Amount available: " + rs.getString("saldo") );
                result=true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return result;
     }
     
     public boolean deposit(User user, String deposit) {
        boolean result = false;
        String sql;
        
        try {
            //Acá se intenta establecer la conexión a la DB
            this.connectDB();
            Statement sta = this.con.createStatement();
            sql = "SELECT * FROM usuario WHERE tarjeta='"+ user.getCard()+"' AND clave='"+ user.getPass()+"'";
            ResultSet rs = sta.executeQuery(sql);            
            while(rs.next()) {
                // Agregar el monto nuevo
                sql = "UPDATE usuario SET saldo = saldo +" + deposit + " WHERE tarjeta='" + user.getCard()+ "'";
                System.out.println(sql);
                Statement update = this.con.prepareStatement(sql);
                update.executeUpdate(sql);                
                sql = "INSERT INTO movimiento (id_usuario, tipo_movimiento, monto) VALUES (" + rs.getString("id") + ", 'I', '" + deposit + "')";
                System.out.println(sql);
                int insert = sta.executeUpdate(sql);
            
                JOptionPane.showMessageDialog(null, "Deposit Success");
                result=true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return result;
    }
     
     public boolean retirement(User user, String retirement) {
        boolean result = false;
        String sql;
        
        try {
            //Acá se intenta establecer la conexión a la DB
            this.connectDB();
            Statement sta = this.con.createStatement();
            sql = "SELECT * FROM usuario WHERE tarjeta='"+ user.getCard()+"' AND clave='"+ user.getPass()+"'";
            ResultSet rs = sta.executeQuery(sql);            
            while(rs.next()) {
                // Retiro
                sql = "UPDATE usuario SET saldo = saldo -" + retirement + " WHERE tarjeta='" + user.getCard()+ "'";
                System.out.println(sql);
                Statement update = this.con.prepareStatement(sql);
                update.executeUpdate(sql);                
                sql = "INSERT INTO movimiento (id_usuario, tipo_movimiento, monto) VALUES (" + rs.getString("id") + ", 'E', '" + retirement + "')";
                System.out.println(sql);
                int insert = sta.executeUpdate(sql);
            
                JOptionPane.showMessageDialog(null, "Retirement success");
                result=true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return result;
        
        
     }
       //Cambiar clave
       public boolean changePass(User user, String passNew) {
          boolean result = false;
        String sql;
        
        try {
            //Acá se intenta establecer la conexión a la DB
            this.connectDB();
            Statement sta = this.con.createStatement();
            sql = "SELECT * FROM usuario WHERE tarjeta='"+ user.getCard()+"' AND clave='"+ user.getPass()+"'";
            ResultSet rs = sta.executeQuery(sql);            
            while(rs.next()) {
                // ACTUALIZO EL SALDO DE LA TABLA USUARIO
                sql = "UPDATE usuario SET clave='"+ passNew + "' WHERE tarjeta='" + user.getCard()+ "'";
                System.out.println(sql);
                Statement update = this.con.prepareStatement(sql);
                update.executeUpdate(sql);                
           
                JOptionPane.showMessageDialog(null, "Change Password Success");
                result=true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
         return result;
    } 
       
       
}
