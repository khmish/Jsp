
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.RowSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author whatup
 */
public class DBfunctions {
    
    private DatabaseOperation dp= new DatabaseOperation();
    private ResultSet resultSet;
    private PreparedStatement ps;
    private UserTable userTable=null;
    
    public boolean login(UserTable user) throws SQLException
    {
        dp.conn();
        ps= dp.prepareStatement("SELECT * FROM userstable WHERE UserName=? and Password =?");
        ps.setString(1, user.getUserName());
        ps.setString(2,user.getPassword());
        resultSet= ps.executeQuery();
        if (resultSet.next()) {
            userTable= new UserTable();
            
            userTable.setUserName(resultSet.getString(0));
            userTable.setPassword(resultSet.getString(1));
            userTable.setName(resultSet.getString(2));
            userTable.setType(resultSet.getString(3));
            return true;
        }
        return false;
    }
    public boolean SignUp(UserTable user) throws SQLException
    {
        dp.conn();
        ps= dp.prepareStatement("INSERT INTO userstable(UserName, Password, Name, UserType) VALUES (?,?,?,?)");
        ps.setString(1, user.getUserName());
        ps.setString(2,user.getPassword());
        ps.setString(3, user.getName());
        ps.setString(4,user.getType());
         ps.executeUpdate();
        if (ps.executeUpdate()==1) {
            userTable=user;
            return true;
        }
        return false;
    }
    public boolean Deactivate(UserTable user) throws SQLException
    {
        dp.conn();
        ps= dp.prepareStatement("UPDATE userstable SET UserType=? WHERE UserName=?");
        ps.setString(1, "0");//1= admin ,2=user ,0=deactivated
        ps.setString(2, user.getUserName());
         ps.executeUpdate();
        if (ps.executeUpdate()==1) {
            userTable=user;
            return true;
        }
        return false;
    }
    public boolean activateAdmin(UserTable user) throws SQLException
    {
        dp.conn();
        ps= dp.prepareStatement("UPDATE userstable SET UserType=? WHERE UserName=?");
        ps.setString(1, "1");//1= admin ,2=user ,0=deactivated
        ps.setString(2, user.getUserName());
         ps.executeUpdate();
        if (ps.executeUpdate()==1) {
            userTable=user;
            return true;
        }
        return false;
    }
    public boolean activateUser(UserTable user) throws SQLException
    {
        dp.conn();
        ps= dp.prepareStatement("UPDATE userstable SET UserType=? WHERE UserName=?");
        ps.setString(1, "2");//1= admin ,2=user ,0=deactivated
        ps.setString(2, user.getUserName());
         ps.executeUpdate();
        if (ps.executeUpdate()==1) {
            userTable=user;
            return true;
        }
        return false;
    }
}
