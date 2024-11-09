package com.connection.sql;
import java.sql.*;

public class CreatingConnection {
    private static Connection con;
    public static Connection getConnection() {
        try {
            if (con == null) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Nov_JDBC", "root", "9990");
            }
        }catch (Exception e )
        {
            e.printStackTrace();
        }
        return con;
    }
}
