package com.models;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataAccess {
    // Atributo
    Connection con;
    
    
    public void connectToDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/atm", "root", "");
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
        
    public boolean validar(User usuario) {
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
      

    public double saldo(User tarsal) {
          double result = 0;
        String sql;
        
        try{
            this.connectToDB();
            Statement sta = this.con.createStatement();
            sql = "SELECT saldo FROM usuario WHERE tarjeta="+tarsal.getTarjeta();
            ResultSet rs = sta.executeQuery(sql);
            while(rs.next()){
                
              result = (rs.getDouble("saldo"));
            }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }
    

    public double depositar(User dep) {
        double result = 0;
        String sql;
        try{
            this.connectToDB();
            Statement sta = this.con.createStatement();
            sql = "SELECT saldo FROM usuario WHERE tarjeta="+dep.getTarjeta();
            ResultSet rs = sta.executeQuery(sql);
            while(rs.next()){
                
                
            }
        
        
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        
        return 0;
    }
}

