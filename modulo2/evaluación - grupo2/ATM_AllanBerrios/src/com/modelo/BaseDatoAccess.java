package com.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class BaseDatoAccess {
      Connection con;
    
    public void ConnectionBD(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/atm", "root", "");
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
    public boolean Validar(Usuario u){
        boolean ResultSet = false;
        String MySql;       
        
        try 
        {
            this.ConnectionBD();
            Statement sta = this.con.createStatement();
            MySql = " SELECT * FROM usuario WHERE tarjeta= '"+ u.getNumTarje() +"' AND clave= '"+ u.getClave()+"' ";
            
            ResultSet rr = sta.executeQuery(MySql);
            
            while(rr.next()) 
            {
                ResultSet = rr.getString("tarjeta").equals(u.getNumTarje()) && rr.getString("clave").equals(u.getClass());
            }
        }
            
        catch (SQLException e)           
        {
            System.out.println( e.getMessage());
            
        }
        
        return ResultSet;
    
        
    }
    
    public boolean ConsultaCuenta(Usuario cc){
        //Consulta de Saldo 
        boolean Resultado = false;
        String sql;
        try {
            
            //Conexion a base de datos
            this.ConnectionBD();
            Statement sta = this.con.createStatement();
            sql = " SELECT * FROM usuario WHERE tarjeta " + cc.getNumTarje()+ " AND clave "+ cc.getClave()+" ";
            
            //consulta con query
            ResultSet rs = sta.executeQuery(sql);            
            while(rs.next()) {
                System.out.println(rs.getInt("id") + " - " + rs.getString("tarjeta") + " - " + rs.getString("clave") + " - " + rs.getString("saldo"));
                //Mostrar por ventana
                JOptionPane.showMessageDialog(null, "Amount available: " + rs.getString("saldo") );
                Resultado=true;
            }
        } 
        catch (SQLException ex) 
        {
            ex.getMessage();
        }
        catch(Exception e)
        {
            String message = e.getMessage();
        }
        return Resultado;
            
    }
    
    public boolean Deposito(Usuario dd){        
        boolean result = false;
        String sql;
        
        try {
            //se intenta establecer la conexión a la BD
            this.ConnectionBD();;
            Statement sta = this.con.createStatement();
            sql = " SELECT * FROM usuario WHERE tarjeta "+ dd.getNumTarje()+" AND clave "+ dd.getClave()+" ";
            ResultSet rs = sta.executeQuery(sql);            
            while(rs.next()) {
                // Agregar el monto nuevo
                sql = " UPDATE usuario SET saldo = saldo + " + dd + " WHERE tarjeta " + dd.getClave()+ " ";
                System.out.println(sql);
                Statement update = this.con.prepareStatement(sql);
                update.executeUpdate(sql);                
                sql = "INSERT INTO movimiento (id_usuario, tipo_movimiento, monto) VALUES (" + rs.getString("id") + ", 'I', '" + dd + "')";
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
    
    public boolean Retiro(Usuario rr){
            boolean result = false;
        String sql;
        
        try {
            //se intenta establecer la conexión a la BD
            this.ConnectionBD();
            Statement sta = this.con.createStatement();
            sql = "SELECT * FROM usuario WHERE tarjeta='"+ rr.getNumTarje()+" AND clave "+ rr.getClave()+" ";
            ResultSet rs = sta.executeQuery(sql);            
            while(rs.next()) {
                // Retiro
                sql = "UPDATE usuario SET saldo = saldo -" + rr + " WHERE tarjeta " + rr.getNumTarje()+ " ";
                System.out.println(sql);
                Statement update = this.con.prepareStatement(sql);
                update.executeUpdate(sql);                
                String retirement = null;
                sql = "INSERT INTO movimiento (id_usuario, tipo_movimiento, monto) VALUES (" + rs.getString("id") + ", 'E', '" + retirement + "')";
                System.out.println(sql);
                int insert = sta.executeUpdate(sql);
            
                JOptionPane.showMessageDialog(null, "Retirement success");
                result=true;
            }
        } 
        catch (SQLException ex) 
        {
            ex.getMessage();
        }
        
        return result;
    }
    
    public boolean CambioClave(Usuario Cc){
              boolean result = false;
        String sql;
        
        try {
            //se intenta establecer la conexión a la DB
            this.ConnectionBD();
            Statement sta = this.con.createStatement();
            sql = "SELECT * FROM usuario WHERE tarjeta='"+ Cc.getNumTarje()+" AND clave "+ Cc.getClave()+" ";
            ResultSet rs = sta.executeQuery(sql);            
            while(rs.next()) {
                // ACTUALIZO EL SALDO DE LA TABLA USUARIO
                sql = "UPDATE usuario SET clave "+ Cc.getClave()+ " WHERE tarjeta='" + Cc.getNumTarje()+ " ";
                System.out.println(sql);
                Statement update = this.con.prepareStatement(sql);
                update.executeUpdate(sql);                
           
                JOptionPane.showMessageDialog(null, "Change Password Success");
                result=true;
            }
        } 
        catch (SQLException ex) 
        {    
            ex.getMessage();
        }
        catch(Exception e)
        {
            e.getMessage();
        }
         return result;
    }   
  
}
