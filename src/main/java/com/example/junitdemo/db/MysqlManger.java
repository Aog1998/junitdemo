package com.example.junitdemo.db;

import java.sql.*;

public class MysqlManger {
    private  static Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    public static  Connection getConn() {
        String url = "jdbc:mysql://localhost:3306/junitdemo";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                conn = (Connection) DriverManager.getConnection(url, "root",
                        "123456");
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public  void close() {
        try {
            rs.close();
            ps.close();
            conn.close();
        } catch (SQLException e) {
            e.getMessage();
        }
    }
}
