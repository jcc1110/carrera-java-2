package models;
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
    public String consultar(User usuario) {
        String result = " ";
        String sql;
        
        try {
            this.connectToDB();            
            Statement sta = this.con.createStatement();
            sql = "SELECT * FROM usuario WHERE tarjeta="+ usuario.getTarjeta();
            
            ResultSet rs = sta.executeQuery(sql);                        
            while(rs.next()) {
                result = (rs.getString("saldo") );
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return result;
    }
    
    public boolean depositar(String tarjeta, double monto) {
          boolean result = false;
          String user = null;
          String sql;
          String sql1;
          String sql3;
          double saldo = 0;
        
        try {
            this.connectToDB();            
            Statement sta = this.con.createStatement();
            sql = "SELECT * FROM usuario WHERE tarjeta="+ tarjeta;
            ResultSet rs = sta.executeQuery(sql);                        
            while(rs.next()) {
                user = rs.getString("id");
                saldo = rs.getDouble("saldo");
            }
            sql1 = "INSERT INTO movimiento (id_usuario, tipo_movimiento, monto) values("+user+",'I',"+monto+") ";
            
              int  res = sta.executeUpdate(sql1);
              if(res >0){
                saldo = saldo + monto;
                sql3 = "Update usuario set saldo="+saldo+" where id="+user+" ";
                int  res1 = sta.executeUpdate(sql3);
                
                if(res1 > 0){
                    result =true;
                }             
              }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return result;
    }

    public boolean retirar(String tarjeta, double monto) {
        boolean result = false;
          String user = null;
          String sql;
          String sql1;
          double saldo = 0;
        
        try {
            this.connectToDB();            
            Statement sta = this.con.createStatement();
            sql = "SELECT * FROM usuario WHERE tarjeta="+ tarjeta;
            ResultSet rs = sta.executeQuery(sql);                        
            while(rs.next()) {
                user = rs.getString("id");
                saldo = rs.getDouble("saldo");
            }
            if(monto <= saldo){
                saldo = saldo - monto;
                sql1 = "Update usuario set saldo="+saldo+" where id="+user+" ";
                int  res1 = sta.executeUpdate(sql1);
                
                if(res1 > 0){
                    result =true;
                }             
            } 
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return result;
    }

    public boolean cambiarClave(String tarjeta, String newclave) {
         boolean result = false;
          String user = null;
          String sql;
          String sql1;
        
        try {
            this.connectToDB();            
            Statement sta = this.con.createStatement();
            sql = "SELECT * FROM usuario WHERE tarjeta="+ tarjeta;
            ResultSet rs = sta.executeQuery(sql);                        
            while(rs.next()) {
                user = rs.getString("id");
            }
                sql1 = "Update usuario set clave="+newclave+" where id="+user+" ";
                int  res1 = sta.executeUpdate(sql1);
                
                if(res1 > 0){
                    result =true;
                }             
             
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return result;
    }
}
