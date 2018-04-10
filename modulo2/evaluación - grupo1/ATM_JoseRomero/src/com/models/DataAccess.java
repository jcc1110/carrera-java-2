package com.models;
import java.sql.*;
/**
 * @author Jose Romero
 * version 1.0.0
 */
public class DataAccess {
    //Atributo
    Connection con;
    
    public void conexionDB(){
        try{
            //incluyo la libreria al proyecto
            Class.forName("com.mysql.jdbc.Driver");
            this.con= DriverManager.getConnection("jdbc:mysql://localhost:3306/atm", "root", "");
            } catch (SQLException | ClassNotFoundException ex) {
                System.out.println(ex.getMessage());
                }
    }        
    public boolean validar(User usuario){
        boolean result= false;
        String sql;
        try {
            this.conexionDB();
            //Preparo la consulta
            Statement sta = con.createStatement();
            sql = "SELECT * FROM usuario WHERE tarjeta='"+ usuario.getTarjeta() +"' AND clave='"+ usuario.getClave() +"'";
            ResultSet rs = sta.executeQuery(sql);
            while(rs.next()) {
                result = (rs.getString("tarjeta").equals(usuario.getTarjeta()) && rs.getString("clave").equals(usuario.getClave()));
            }
        } catch (SQLException se){
            System.out.println(se.getMessage());
                           
            }
        return result;
            
        }
    
    public double consultar(User usuario){
        
        String sql;
        double result= 0.0;
        try {
            this.conexionDB();
            //Preparo la consulta
            Statement sta = con.createStatement();
            sql = "SELECT saldo FROM usuario WHERE tarjeta='"+ usuario.getTarjeta() +"'";
            ResultSet rs = sta.executeQuery(sql);
            while(rs.next()) {
                result = rs.getDouble("saldo");
            }
        } catch (SQLException se){
            System.out.println(se.getMessage());
                           
            }
        return result;
                        
    }
    public boolean depositar(User usuario){
        int ID=0, saldonew=0;
        String sql;
        double saldo=0;
        boolean depo=false;
        //obtener el id del cliente
        try {
            this.conexionDB();
            //Preparo la consulta
            Statement sta = this.con.createStatement();
            sql = "SELECT id FROM usuario WHERE tarjeta='"+ usuario.getTarjeta() +"'";
            ResultSet rs = sta.executeQuery(sql);
            while(rs.next()) {
                ID = rs.getInt("id");
            }
            //insertar el registro del deposito
            int resultado = sta.executeUpdate("INSERT INTO movimiento (id_usuario, tipo_movimiento_monto) VALUES ("+ID+",'I', "+usuario.getDeposito()+")");
            
            // verificar que el registro fue exitoso
            if(resultado > 0){
                sql= "SELECT saldo FROM usuario WHERE tarjeta='"+ usuario.getTarjeta()+"'";
                ResultSet dep = sta.executeQuery(sql);
                while(dep.next()) {
                    saldo = dep.getDouble("saldo");
                }
                saldo = saldo + usuario.getDeposito();
                saldonew = sta.executeUpdate("UPDATE usuario set saldo="+saldo+" where id='"+ID+"'");
                depo = true;
                }else {
                        depo = false;
                        }
            
        } catch (SQLException se){
            System.out.println(se.getMessage());
                           
            }
        return depo;
        
    }
        
    
}
