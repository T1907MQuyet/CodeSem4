package example.model;

import example.da.UserDataAccess;
import example.da.UserDataAccess;

import java.sql.SQLException;

public class UserFinderBean {
    public boolean checkLogin(String username,String pass)throws SQLException, ClassNotFoundException
    {
        return new UserDataAccess().checkLoginUser(username,pass);
    }
}
