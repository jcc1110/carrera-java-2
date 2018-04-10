package models;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DataAccess {
    // Atributo
    Connection con;
    //Metodo paa conecta a la Base de datos
    public void connectToDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //cambiar esta linea para que corra en el curso ya que tiene la clave de mi maquina 
            //this.con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/atm", "root", "root");
            this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm", "root", "");
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
    
    public int Consulta(User usuario) {
        int result=0;
        String sql;
        
        try {
            this.connectToDB();            
            Statement sta = this.con.createStatement();
            sql = "SELECT * FROM usuario WHERE tarjeta='"+ usuario.getTarjeta() +"'";
            
            ResultSet rs = sta.executeQuery(sql);                        
            while(rs.next()) {
                result = (rs.getInt("saldo"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return result;
    }
    
    public void Retiro(User usuario) {
        double result=0;
        String sql;
        double retiro=0;
 
        try {
            this.connectToDB();            
            Statement sta = this.con.createStatement();
            sql = "SELECT * FROM usuario WHERE tarjeta='"+ usuario.getTarjeta() +"'";
            
            ResultSet rs = sta.executeQuery(sql);                        
            while(rs.next()) {
                result = (rs.getInt("saldo"));
            }
            JFrame frame = new JFrame("");
            if (result<usuario.getMonto()){

            // show a joptionpane dialog using showMessageDialog
            JOptionPane.showMessageDialog(frame,"Saldo Insuficiente","",JOptionPane.INFORMATION_MESSAGE);  
            } else {
                retiro = result - usuario.getMonto();
                sql= "INSERT movimiento(tipo_movimiento, monto) VALUES ('r','"+usuario.getMonto()+"')";
                sta.execute(sql);
                sql= "UPDATE usuario SET saldo='"+retiro+"' WHERE tarjeta='"+ usuario.getTarjeta() +"'";
                sta.execute(sql);
                JOptionPane.showMessageDialog(frame,"Retiro Satisfactorio","",JOptionPane.INFORMATION_MESSAGE);  
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } 
    }

    public void Deposito(User usuario) {
        double result=0;
        String sql;
        double deposito=0;
        
        try {
            this.connectToDB();            
            Statement sta = this.con.createStatement();
            sql = "SELECT * FROM usuario WHERE tarjeta='"+ usuario.getTarjeta() +"'";
            
            ResultSet rs = sta.executeQuery(sql);                        
            while(rs.next()) {
                result = (rs.getInt("saldo"));
            }
                JFrame frame = new JFrame("");
                deposito = result + usuario.getMonto();
                sql= "INSERT movimiento(tipo_movimiento, monto) VALUES ('d','"+usuario.getMonto()+"')";
                sta.execute(sql);
                sql= "UPDATE usuario SET saldo='"+deposito+"' WHERE tarjeta='"+ usuario.getTarjeta() +"'";
                sta.execute(sql);
                JOptionPane.showMessageDialog(frame,"Deposito Satisfactorio","",JOptionPane.INFORMATION_MESSAGE);  

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } 
    }
    
        public void cambioClave(User usuario) {
        String sql;
        try {
            this.connectToDB();            
            Statement sta = this.con.createStatement();
            //JFrame frame = new JFrame("");
                sql= "UPDATE usuario SET clave='"+usuario.getClave()+"' WHERE tarjeta='"+ usuario.getTarjeta() +"'";
                sta.execute(sql);
                //JOptionPane.showMessageDialog(frame,"Cambio de Clave satisfactorio","",JOptionPane.INFORMATION_MESSAGE);  

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
}