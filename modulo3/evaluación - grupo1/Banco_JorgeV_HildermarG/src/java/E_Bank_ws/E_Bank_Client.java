/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E_Bank_ws;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Suwadith
 */
@WebService(serviceName = "E_Bank_Client")
public class E_Bank_Client {
    
    private static Connection conn = null;
    private static Statement stmt = null;
    

    private Connection makeConnection() throws SQLException {
        if (conn == null) {
            new com.mysql.jdbc.Driver();
            conn = DriverManager.getConnection("jdbc:mysql://localhost/e_bank", "root", "");
        }
        return conn;
    }
    
    public boolean registerClient(String name, String dob, String address, int mobile, String e_mail, 
            int account_number, String account_type, String sort_code, int balance, String card) {
        
        try {
            makeConnection();
            System.out.println("Connection successfully made\n");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.err.println("Connection Failure");
        }

        try {
            String sql = "INSERT INTO client_details(name, dob, address, mobile, e_mail, account_number, "
                    + "account_type, sort_code, balance, card) "
                    + "VALUES('" + name + "','" + dob + "','" + address + "','" + mobile + "','" + e_mail 
                    + "','" + account_number + "','" + account_type + "','" + sort_code + "','" + balance + "','" + card + "')";
            stmt = conn.createStatement();
            int rs = stmt.executeUpdate(sql);
            return true;

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return false;
    }

    public boolean editClient(String name, String dob, String address, int mobile, String e_mail, 
            int account_number, String account_type, String sort_code, int balance, String card) {
        try {
            makeConnection();
            System.out.println("Connection successfully made\n");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.err.println("Connection Failure");
        }

        try {
            String sql = "UPDATE client_details SET name='" + name + "', dob='" + dob + "', address='" 
                    + address + "', mobile='" + mobile + "', e_mail='" + e_mail + "', account_number='" 
                    + account_number + "', account_type='" + account_type + "', sort_code='" + sort_code 
                    + "', balance='" + balance + "', card='" + card + "' WHERE account_number='" + account_number+"'";
            stmt = conn.createStatement();
            int rs = stmt.executeUpdate(sql);

            return true;

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return false;
    }
    
    public boolean deleteClient(int account_number) {
        try {
            makeConnection();
            System.out.println("Connection successfully made\n");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.err.println("Connection Failure");
        }
        
        try{
            String sql = "DELETE FROM client_details WHERE username='"+account_number+"'";
            stmt = conn.createStatement();
            int rs = stmt.executeUpdate(sql);
            return true;
        } catch(SQLException ex){
            ex.printStackTrace();
        }
        return false;
    }
    
    public boolean displayClientList() {
        try {
            makeConnection();
            System.out.println("Connection successfully made\n");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.err.println("Connection Failure");
        }
        
        try{
            String sql = "SELECT * FROM client_details";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                System.out.println("\nname : " + rs.getString("name") + "\ndob : " 
                        + rs.getString("dob") + "\naddress : " + rs.getString("address")
                + "\nmobile : " + rs.getString("mobile")+ "\ne_mail : " + rs.getString("e_mail")
                + "\naccount_number : " + rs.getString("account_number")+ "\naccount_type : " + rs.getString("account_type")
                + "\nsort_code : " + rs.getString("sort_code")+ "\nbalance : " + rs.getString("balance")
                + "\ncard : " + rs.getString("card")); 
            }
            return true;
        } catch(SQLException ex){
            ex.printStackTrace();
        }
        return false;
    }
    
}
