package com.example.da;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private  static Connection connection;
    public  static  Connection getConnection() throws ClassNotFoundException, SQLException {
        if (connection== null){
            //1 Loading driver
            Class.forName("com.mysql.cj.jdbc.Driver");
                    // 2 connection
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/fpt_aptech?serverTimezone=UTC","root","");
        }
        return  connection;
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        if (getConnection()!=null ){
            System.out.println("oke");
        }

    }


}
