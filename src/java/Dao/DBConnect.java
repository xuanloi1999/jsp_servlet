/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author xuanl
 */
public class DBConnect {
    public DBConnect() {
    }
    
    public Connection getConnection()throws Exception {
        //SQL server:
        //"jdbc:sqlserver://"+serverName+":"+portNumber +";databaseName="+dbName;
        //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        
        String url = "jdbc:mysql://"+serverName+":"+portNumber + "/" +dbName;
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection(url, username, password);
    }   
   /*
    Username: GhqIzTsvUf

Database name: GhqIzTsvUf

Password: 2TNDhQAaLF

Server: remotemysql.com

Port: 3306
    */
    private final String serverName = "localhost";
    private final String portNumber = "3306";
    private final String dbName = "doan_java";
    private final String username = "root";
    private final String password = "";
    
   // Test ket noi DB
    public static void main(String[] args) throws  Exception{ 
        System.out.println(new DBConnect().getConnection());
        
        
    }
}
