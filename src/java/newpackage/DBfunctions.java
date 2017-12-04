package newpackage;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
        dp.connect();
        ps= dp.prepareStatement("SELECT * FROM userstable WHERE UserName=? and Password =? and UserType !='0'");
        ps.setString(1, user.getUserName());
        ps.setString(2,user.getPassword());
        resultSet= ps.executeQuery();
        if (resultSet.next()) {
            userTable= new UserTable();
            
            userTable.setUserName(resultSet.getString(1));
            userTable.setPassword(resultSet.getString(2));
            userTable.setName(resultSet.getString(3));
            userTable.setType(resultSet.getString(4));
            dp.close();
            return true;
        }
        dp.close();
        return false;
    }
    public boolean SignUp(UserTable user) throws SQLException
    {
        dp.connect();
        ps= dp.prepareStatement("INSERT INTO userstable(UserName, Password, Name, UserType) VALUES (?,?,?,?)");
        ps.setString(1, user.getUserName());
        ps.setString(2,user.getPassword());
        ps.setString(3, user.getName());
        ps.setString(4,user.getType());
         ps.executeUpdate();
        if (ps.executeUpdate()==1) {
            userTable=user;
            dp.close();
            return true;
        }
        dp.close();
        return false;
    }
    public boolean Deactivate(UserTable user) throws SQLException
    {
        dp.connect();
        ps= dp.prepareStatement("UPDATE userstable SET UserType=? WHERE UserName=?");
        ps.setString(1, "0");//1= admin ,2=user ,0=deactivated
        ps.setString(2, user.getUserName());
         ps.executeUpdate();
        if (ps.executeUpdate()==1) {
            userTable=user;
            dp.close();
            return true;
        }
        dp.close();
        return false;
    }
    public boolean activateAdmin(UserTable user) throws SQLException
    {
        dp.connect();
        ps= dp.prepareStatement("UPDATE userstable SET UserType=? WHERE UserName=?");
        ps.setString(1, "1");//1= admin ,2=user ,0=deactivated
        ps.setString(2, user.getUserName());
         ps.executeUpdate();
        if (ps.executeUpdate()==1) {
            userTable=user;
            dp.close();
            return true;
        }
        dp.close();
        return false;
    }
    public boolean activateUser(UserTable user) throws SQLException
    {
        dp.connect();
        ps= dp.prepareStatement("UPDATE userstable SET UserType=? WHERE UserName=?");
        ps.setString(1, "2");//1= admin ,2=user ,0=deactivated
        ps.setString(2, user.getUserName());
         ps.executeUpdate();
        if (ps.executeUpdate()==1) {
            userTable=user;
            dp.close();
            return true;
        }
        dp.close();
        return false;
    }

    /**
     * @return the userTable
     */
    public UserTable getUserTable(UserTable user) throws SQLException {
        dp.connect();
        ps= dp.prepareStatement("SELECT * FROM userstable WHERE UserName=? and Password =?");
        ps.setString(1, user.getUserName());
        ps.setString(2,user.getPassword());
        resultSet= ps.executeQuery();
        if (resultSet.next()) {
            userTable= new UserTable();
            
            userTable.setUserName(resultSet.getString(1));
            userTable.setPassword(resultSet.getString(2));
            userTable.setName(resultSet.getString(3));
            userTable.setType(resultSet.getString(4));
            dp.close();
            
        }
        dp.close();
        return userTable;
    }
   
}
