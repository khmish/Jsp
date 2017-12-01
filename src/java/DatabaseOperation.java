



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
//
/**
 **
 * @author 
 */
public class DatabaseOperation {
    
   public String driver="com.mysql.jdbc.Driver";
     public String URL = "jdbc:mysql://localhost:3306/mydata";
     public String username = "root";
     public String password = "";
     public Connection conn;
     
     DatabaseOperation(String URL,String username,String password){
         this.URL=URL;
         this.username=username;
         this.password=password;
     }

    DatabaseOperation() {
    }

    //to connect to database
    public boolean connect() throws SQLException {
       
        try {
            Class.forName(driver);
             conn=DriverManager.getConnection(URL,username,password);
             return true;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
       return false;
       
    }
    // close the connection with database
    public boolean close(){
         try {
             conn.close();
             return true;
         } catch (SQLException ex) {
             Logger.getLogger(DatabaseOperation.class.getName()).log(Level.SEVERE, null, ex);
         }
         return false;
    }
 
public ResultSet executeQuery(String query) throws SQLException{
       
            Statement stmt = conn.createStatement();
            return stmt.executeQuery(query);
        
        
    }
    
    public PreparedStatement prepareStatement(String query) throws SQLException{
        
            PreparedStatement ps = conn.prepareStatement(query);
            return ps;
       
    }

    void conn() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
