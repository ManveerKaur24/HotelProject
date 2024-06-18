/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author MANVEER KAUR
 */
public class UserService implements UserRepository {

    @Override
    public void register(Users user) throws Exception {
        MySqlConnection my_sql = new MySqlConnection();
        Connection con = my_sql.getConnection("Hms");
        PreparedStatement ps = con.prepareStatement("Insert into users (Username,Email,Contact,Address,Password) values (?,?,?,?,?)");
        ps.setString(1, user.getUsername());
        ps.setString(2, user.getEmail());
        ps.setString(3, user.getContact());
        ps.setString(4, user.getAddress());
        ps.setString(5, user.getPassword());

        int i = ps.executeUpdate();

    }

    @Override
    public boolean CheckExistence(Users user) throws Exception {
        return true;
    }

    @Override
    public void login(Users user) {
    }
}
// add , update, view on room
