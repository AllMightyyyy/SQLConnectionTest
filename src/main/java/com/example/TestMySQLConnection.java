package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestMySQLConnection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/blogPost_db?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC";
        String username = "root";
        String password = "root"; // If there's no password, leave it blank

        System.out.println("Testing connection to database...");

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connection successful!");
        } catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        }
    }
}
