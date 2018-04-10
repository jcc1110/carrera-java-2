/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saime.models;
import com.saime.controllers.Operation;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 * version 1.0.0
 * @author Michelle
 */
public class DataAccess {
        //Atributo
    private Connection on;
    
    public void connectToDB() {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
             this.on = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm", "root", "");
        }catch (SQLException | ClassNotFoundException ex){
            System.out.println(ex.getMessage());
        }
    }

    public Connection getOn() {
        return on;
    }    
    
    public boolean ingresar(Operation usuario) {
        boolean result = false;
        String sql;
        
        try {
            this.connectToDB();
            Statement sta = this.on.createStatement();
            sql = "SELECT * FROM usuario WHERE tarjeta='"+ usuario.getTarjeta() +"' AND clave='"+ usuario.getPassword()+"'";
            ResultSet rs = sta.executeQuery(sql); 
            
            
            while(rs.next()) {
                result = (rs.getString("tarjeta").equals(usuario.getTarjeta()) && rs.getString("clave").equals(usuario.getPassword()));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return result;
        }
        
    public boolean consultaSaldo(Operation usuario, String balance){
        boolean result = false;
        String sql;
        
        try{
            this.connectToDB();
            Statement sta = this.on.createStatement();
            
            sql = "SELECT * FROM usuario WHERE tarjeta='"+ usuario.getTarjeta() +"' AND clave='"+ usuario.getPassword()+"'";
            ResultSet rs = sta.executeQuery(sql);            
            while(rs.next()) {
                System.out.println(rs.getInt("id") + " - " + rs.getString("tarjeta") + " - " + rs.getString("clave") + " - " + rs.getString("saldo"));
                JOptionPane.showMessageDialog(null, "Su saldo es:" + rs.getString("saldo"));
                result=true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return result;
    
    }
    
    public boolean deposito(Operation usuario, String balance){
        boolean result = false;
        String sql;
        
        try {
            this.connectToDB();
            Statement sta = this.on.createStatement();
            
            sql = "SELECT * FROM usuario WHERE tarjeta='"+ usuario.getTarjeta() +"' AND clave='"+ usuario.getPassword()+"'";
            ResultSet rs = sta.executeQuery(sql);
            while(rs.next()) {
                // Se actualiza el saldo de la tabla usuario
                sql = "UPDATE usuario SET saldo = saldo +" + balance + " WHERE tarjeta='" + usuario.getTarjeta() + "'";
                System.out.println(sql);
                Statement update = this.on.prepareStatement(sql);
                update.executeUpdate(sql);                
                //Se inserta el deposito en la tabla movimiento
                sql = "INSERT INTO movimiento (id_usuario, tipo_movimiento, monto) VALUES (" + rs.getString("id") + ", 'I', '" + balance + "')";
                System.out.println(sql);
                int insert = sta.executeUpdate(sql);
            
                JOptionPane.showMessageDialog(null, "Deposito Exitoso");
            }
        } catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }
        
    
    public boolean retiro(Operation usuario, String retiro){
        boolean result = false;
        String sql;
        
        try {
            this.connectToDB();
            Statement sta = this.on.createStatement();
            
            sql = "SELECT * FROM usuario WHERE tarjeta='"+ usuario.getTarjeta() +"' AND clave='"+ usuario.getPassword()+"'";          
            ResultSet rs = sta.executeQuery(sql);
            while(rs.next()) {
                //Se actualiza el saldo de la tabla usuario
                sql = "UPDATE usuario SET saldo = saldo -" + retiro + " WHERE tarjeta='" + usuario.getTarjeta() + "'";
                System.out.println(sql);
                Statement update = this.on.prepareStatement(sql);
                update.executeUpdate(sql);                
                // Se inserta el movimiento en la tabla movimiento
                sql = "INSERT INTO movimiento (id_usuario, tipo_movimiento, monto) VALUES (" + rs.getString("id") + ", 'E', '" + retiro + "')";
                System.out.println(sql);
                int insert = sta.executeUpdate(sql);
            
                JOptionPane.showMessageDialog(null, "Retiro Exitoso");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
         return result;
        }
    


    public boolean cambioClave(Operation usuario, String nuevaclave){
        boolean result = false;
        String sql;

            try {
            this.connectToDB();
            Statement sta = this.on.createStatement();
            sql = "SELECT * FROM usuario WHERE tarjeta='"+ usuario.getTarjeta() +"' AND clave='"+ usuario.getPassword()+"'";
            ResultSet rs = sta.executeQuery(sql);            
            while(rs.next()) {
                // Se actualiza el saldo de la tabla usuario
                sql = "UPDATE usuario SET clave='"+ nuevaclave + "' WHERE tarjeta='" + usuario.getTarjeta() + "'";
                System.out.println(sql);
                Statement update = this.on.prepareStatement(sql);
                update.executeUpdate(sql);                
           
                JOptionPane.showMessageDialog(null, "Su clave ha sido cambiada exitosamente");
                
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
          return result;
}
   
}

