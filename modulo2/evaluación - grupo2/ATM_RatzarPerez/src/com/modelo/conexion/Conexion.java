/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modelo.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ratzar
 */
public class Conexion {

    private String nombreBd = "atm";
    private String usuario = "root";
    private String password = "";
    private String url = "jdbc:mysql://localhost/" + nombreBd;

    Connection conn = null;
    //constructor de la clase

    public Conexion() {
        try {
            //obtener el driver
            Class.forName("com.mysql.jdbc.Driver");
            //obtener la conexion
            conn = DriverManager.getConnection(url, usuario, password);
            if (conn != null) {
                System.out.println("Conexion Exitosa  a la BD: " + nombreBd);
            }
        } catch (ClassNotFoundException e) {
            System.out.println("ocurre una ClassNotFoundException : " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("ocurre una SQLException: " + e.getMessage());
        }
    }

/**
 * Metodo utilizado para establecer la conexion con la base de datos
 * @return conn; resultado de la conexion a la base de datos
 * si la conexion fallo conn retorna null
 */
 
    public Connection getConnection() {
        return conn;
    }
    
/**
 * Metodo utilizado para cerrar la conexion con la base de datos
 */
    public void desconectar() {
        conn = null;
    }

}
