package com.tsystems.projects.logiweb;

import java.sql.*;

/**
 * Created by StarKiller on 14.10.2014.
 */
public class SimpleAccess {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/logiweb", "root", "root");

        Statement statement = con.createStatement();

        ResultSet resultSet = statement.executeQuery("SELECT name, description from capacity");

        while (resultSet.next()) {
            System.out.print(resultSet.getString("NAME"));
            System.out.print(" ");
            System.out.println(resultSet.getString("description"));
            System.out.println("----");
        }


    }
}
