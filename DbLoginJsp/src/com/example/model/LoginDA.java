package com.example.model;

import java.sql.*;

public class LoginDA {
    private String username, password;

    public LoginDA() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private static final String tblName = "account";
    //1. tao connection object
    private static Connection conn = null;
    private static Statement stmt = null;
    private static PreparedStatement pstm = null;

    public static void createConnection() throws SQLException, ClassNotFoundException {
        //Step1 dang ky driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        //step;
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/accounts", "root", "");

    }


    public static boolean checkLoginStatement(String user, String pass) throws SQLException {
        String dbQuery = "SELECT username FROM user WHERE username='"+user+"' AND password='"+pass+"'";
        stmt = conn.createStatement();
        ResultSet resultSet = stmt.executeQuery(dbQuery);
        while (resultSet.next()){
/*
            System.out.println("Username is :" +resultSet.getString("username"));
*/
            return  true;
        }return  false;


    }

}
