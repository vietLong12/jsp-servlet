package com.example.jweb_start.MyConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {

    // Local mysql: localhost:3306
    private String hostUrl;
    private String db;
    private String port;
    private String username;
    private String password;

    public MyConnection(){
        // Local mysql: localhost:3306
        hostUrl = "localhost";
        port = "3306";
        db = "bank_data";
        username = "root";
        password = "revival1";
    }

    public MyConnection(String hostUrl, String db, String port, String username, String password) {
        this.hostUrl = hostUrl;
        this.db = db;
        this.port = port;
        this.username = username;
        this.password = password;
    }

    private String getUrlConnection(){
        return "jdbc:mysql://" + hostUrl + ":" + port + "/" + db;
    }

    public Connection getConnection() {
        Connection cn = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection(getUrlConnection(), username, password);
        }catch (ClassNotFoundException ex){
            System.out.println("Class not found");
        } catch (SQLException e) {
            System.out.println("SQL Exception: " +e.getMessage());
        }

        return cn;
    }
}
