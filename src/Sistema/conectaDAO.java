package Sistema;


import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class conectaDAO {
private static final String DRIVER="com.mysql.cj.jdbc.Driver";
private static final String URL = "jdbc:mysql://localhost:3306/casaleiloes";
private static final String USER = "root";
private static final String PASS = "85TAI20na:)";
  
  
    public static Connection connectDB(){
        try {
            Connection conn;
            Statement st;
             Class.forName(DRIVER);
           return DriverManager.getConnection(URL, USER,PASS);
        } catch (ClassNotFoundException | SQLException ex) {
               throw new RuntimeException ("Erro ConectaDAO", ex);
      }
        }

    

}
