package com.mycompany.mavenproject1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
//import javax.swing.JOptionPane;

/**
 *
 * @author MANVEER KAUR
 */
public class MySqlConnection {

    Connection con = null;

    public Connection getConnection(String db) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hms", "root", "");
            return con;

        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Cannot connect to Database..." + ex);
        }

    }

}
