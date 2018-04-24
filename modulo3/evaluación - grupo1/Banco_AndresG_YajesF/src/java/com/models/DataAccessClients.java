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
public class DataAccessClients {

    //Atributo para establecer la Conexión a la Base de Datos
    Connection con;

    public void connectToDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/atm", "root", "");            
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
        
    /**
     *Método GetClient()
     * @param ced
     * @return Se obtienen los datos del Cliente
     */
    public Clients GetClient(int ced) {
        Clients result = null;
        String sql;
        
        try {
            this.connectToDB();            
            Statement sta = this.con.createStatement();
            sql = "SELECT * FROM clientes WHERE cedula="+ ced;
            ResultSet rs = sta.executeQuery(sql);                        
            
            while(rs.next()) {
                result.setNombres((rs.getString("nombres")!=null)?rs.getString("nombres"):"");
                result.setApellidos((rs.getString("apellidos")!=null)?rs.getString("apellidos"):"");
                result.setCedula((rs.getInt("cedula")!=0)?rs.getInt("cedula"):0);
                result.setTelefono((rs.getString("telefono")!=null)?rs.getString("telefono"):"");
                        
//                result[2]=rs.getString("telefono");
//                result[3]=rs.getString("correo");
//                result[4]=rs.getString("saldo");
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
