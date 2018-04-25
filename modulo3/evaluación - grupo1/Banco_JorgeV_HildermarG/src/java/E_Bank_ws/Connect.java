
package E_Bank_ws;


import com.mysql.jdbc.Driver;
import java.sql.*;
import java.util.Scanner;

public class Connect {

    static Connection conn = null;
   static Statement stmt = null;

    public Connect() throws SQLException {
        makeConnection();
    }

    public Connection makeConnection() throws SQLException {
        if (conn == null) {
            new Driver();
            conn = (E_Bank_ws.Connection) DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "");
        }
       return conn;
    }

   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            Connect c = new Connect();
           System.out.println("Connection established\n");
        } catch (SQLException e) {
            e.printStackTrace();
           System.err.println("Connection Failure");
        }
        System.out.println("Which table do you want to read?");
        System.out.println("1.Student");
       System.out.println("2.Courses");
       System.out.print("Enter here: ");
        int ans = input.nextInt();
        if (ans == 1) {
           try {
               String sql = "SELECT * FROM Student";
               System.out.println("StdID\tName\tMarks");
                System.out.println("---------------------");
                stmt = conn.createStatement();
               ResultSet rs = stmt.executeQuery(sql);

               while (rs.next()) {
                   //Retrieve by column name

                  String id = rs.getString("Student_ID");
                    String name = rs.getString("Student_Name");
                    int mark = rs.getInt("Marks");

                    //Display values
                    System.out.println(id + "\t" + name + "\t" + mark);
                    System.out.println();
                }
              rs.close();
           } catch (SQLException e) {
                e.printStackTrace();
            }
        } else if (ans == 2) {
            try {
               String sql = "SELECT * FROM Courses";
               System.out.println("C_ID\tC_Name");
              System.out.println("--------------");
               stmt = conn.createStatement();
               ResultSet rs = stmt.executeQuery(sql);

                while (rs.next()) {
                   //Retrieve by column name

                   String id = rs.getString("Course_ID");
                   String name = rs.getString("Course_Name");

                   //Display values
                    System.out.println(id + "\t" + name + "\t");
                    System.out.println();
               }
                rs.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }
       }
    }

}
