/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saime.models;

import java.sql.*;

public class DataAccess {
    //atributo
    Connection con;
    
  public void connectToDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/atm", "root", "");
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
}
    
    public boolean validar(Usuario usuario) {
        boolean result = false;
        String sql;
        
        try {
            this.connectToDB();            
            Statement sta = this.con.createStatement();
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
    
    public double consultasaldo(Usuario usuario){
        
        Double result= 0.0;
        String sql;
        try{
           this.connectToDB();            
            Statement sta = this.con.createStatement();
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
        //obtener el id del cliente
        try{
            this.connectToDB();            
            Statement sta = this.con.createStatement();
            
            sql = "SELECT id FROM usuario WHERE tarjeta='"+usuario.getTarjeta()+"'";
            ResultSet rs = sta.executeQuery(sql);            
            while(rs.next()) {
                ID = rs.getInt("id");
            }            
            //insertar el registro del deposito
            int resultado = sta.executeUpdate("INSERT INTO movimiento (id_usuario, tipo_movimiento, monto) VALUES ("+ID+", 'I', "+usuario.getDeposito()+")");
            
            //verificar que el registro fue exitoso
            if(resultado > 0) {
                sql = "SELECT saldo FROM usuario WHERE tarjeta='"+usuario.getTarjeta()+"'";
                ResultSet dep = sta.executeQuery(sql);        
                while(dep.next()) {
                   saldo = dep.getDouble("saldo");
                }
                
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
        //obtener el id del cliente
        try{
            this.connectToDB();            
            Statement sta = this.con.createStatement();
            
            sql = "SELECT id FROM usuario WHERE tarjeta='"+usuario.getTarjeta()+"'";
            ResultSet rs = sta.executeQuery(sql);            
            while(rs.next()) {
                ID = rs.getInt("id");
            }   
                
            sql = "SELECT saldo FROM usuario WHERE tarjeta='"+usuario.getTarjeta()+"'";
                ResultSet dep = sta.executeQuery(sql);        
                while(dep.next()) {
                   saldo = dep.getDouble("saldo");
                }
                
            if(saldo > usuario.getRetiro()){
                   
            //insertar el registro del deposito
            int resultado = sta.executeUpdate("INSERT INTO movimiento (id_usuario, tipo_movimiento, monto) VALUES ("+ID+", 'E', "+usuario.getRetiro()+")");
            
            //verificar que el registro fue exitoso
            
                
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