/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Andrés Gordillo
 */
public class DataAccessUser {

    //Atributo para establecer la Conexión a la Base de Datos
    Connection con;

    public void connectToDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/banco", "root", "");            
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
        
    /**
     *Método ValidateUser()
     * @param usuario
     * @return Se verifica si el Usuario existe en la BD
     */
    public boolean ValidateUser(Users usuario) {
        boolean result = false;
        String sql;
        
        try {
            this.connectToDB();            
            Statement sta = this.con.createStatement();
            sql = "SELECT * FROM usuarios WHERE usuario='"+ usuario.getUsuario() +"' AND clave='"+ usuario.getClave() +"'";
            ResultSet rs = sta.executeQuery(sql);                        

            while(rs.next()) {
                result=true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return result;
    }    

    /**
     *Método SetName()
     * @param usuario
     * @return Se obtiene el Nombre del Cliente
     */
    public String SetName(Users usuario) {
        String sql;
        
        try {
            this.connectToDB();            
            Statement sta = this.con.createStatement();
            sql = "SELECT * FROM usuario WHERE usuario='"+ usuario.getUsuario() +"' AND clave='"+ usuario.getClave() +"'";
            ResultSet rs = sta.executeQuery(sql);                        

            while(rs.next()) {
                return rs.getString("usuario");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return "";
    }    
        
    /**
     *Método GetBalanceUser()
     * @param usuario
     * @return Se obtiene el saldo actual del Cliente
     */
//    public double GetBalanceUser(Users usuario) {
//        double result =0;
//        String sql;
//        
//        try {
//            this.connectToDB();            
//            Statement sta = this.con.createStatement();
//            sql = "SELECT saldo FROM usuario WHERE tarjeta='"+ usuario.getTarjeta() +"'";
//            ResultSet rs = sta.executeQuery(sql);                        
//
//            while(rs.next()) {
//                return Double.parseDouble(rs.getString("saldo"));
//            }
//        } catch (SQLException ex) {
//            System.out.println(ex.getMessage());
//        }        
//        return result;
//    }    

    
}
