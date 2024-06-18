/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rooms;

import com.mycompany.mavenproject1.MySqlConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author MANVEER KAUR
 */
public class Room_service implements Room_repo {

    MySqlConnection ms = null;
    Connection con = null;

    public Room_service() throws Exception {
        ms = new MySqlConnection();
        con = ms.getConnection("Hms");

    }

    @Override
    public void addRoom(Room room) throws Exception {
        PreparedStatement ps = con.prepareStatement("Insert into room (room_no,room_type,amenities,capacity,price,description,status) values (?,?,?,?,?,?,?)");
        ps.setInt(1, room.getRoom_no());
        ps.setString(2, room.getRoom_type());
        ps.setString(3, room.getAmenities());
        ps.setString(4, room.getCapacity());
        ps.setDouble(5, room.getPrice());
        ps.setString(6, room.getDescription());
        ps.setString(7, "Available");
        int i = ps.executeUpdate();
    }

    
    @Override
    public List<Room> showAllRooms() throws Exception {
        List<Room> allRooms = new ArrayList<Room>();
        PreparedStatement ps = con.prepareStatement("Select *from room");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Room room = new Room();
            room.setRoom_no(rs.getInt("Room_no"));
            room.setRoom_type(rs.getString("Room_type"));
            room.setCapacity(rs.getString("Capacity"));
            room.setPrice(rs.getInt("Price"));
            room.setStatus(rs.getString("Status"));
            room.setAmenities(rs.getString("Amenities"));
            allRooms.add(room);

        }
        return allRooms;
    }

    @Override
    public List<Room> showSpecificRoom(String whereclause) throws Exception {
        List<Room> allRooms = new ArrayList<Room>();
        PreparedStatement ps = con.prepareStatement("Select *from rooms" + whereclause);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {

            Room room = new Room();
            room.setRoom_no(rs.getInt("Room_no"));
            room.setRoom_type(rs.getString("Room_type"));
            room.setCapacity(rs.getString("Capacity"));
            room.setPrice(rs.getInt("Price"));
//        room.setStatus(rs.getInt("Status"));
            room.setAmenities(rs.getString("Amenities"));
            allRooms.add(room);

        }
        return allRooms;
    }

    @Override
    public void updateRoom(Room room) throws Exception {
        PreparedStatement ps = con.prepareStatement("Update rooms set name= ?,capapcity=?, ");
        ps.setInt(1, room.getRoom_no());
        ps.setString(2, room.getRoom_type());
        ps.setString(3, room.getAmenities());
        ps.setString(4, room.getCapacity());
        ps.setString(5, room.getDescription());

        int i = ps.executeUpdate();

    }

    @Override
    public void changeRoomStatus(Room room) throws Exception {
try{
        PreparedStatement ps = con.prepareStatement("UPDATE room SET status = 'booked' WHERE room_no = ? AND status = 'Available'");
        ps.setInt(1, room.getRoom_no());
        int rowsUpdated = ps.executeUpdate();
        if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(null, "Room " + room.getRoom_no() + " has been booked.");
        } else {
            JOptionPane.showMessageDialog(null, "Failed to book room " + room.getRoom_no() + ".");
        }}
    catch (SQLException e) {
        // Handle any SQL errors here
        e.printStackTrace();
    }
    }   
      public boolean checkRoomStatus(Room room) throws Exception {
       try {
  
    // Prepare the SQL query
    String sql = "SELECT * FROM room WHERE room_no = ?";
        PreparedStatement statement = con.prepareStatement(sql);
    
    // Set the parameter for room number
    statement.setInt(1, room.getRoom_no());
    
        // Execute the query and get results
        ResultSet resultSet = statement.executeQuery();
    
    // Check if any room exists with the same number
    return resultSet.next();  // returns true if a record exists, false otherwise

  } catch (SQLException e) {
    e.printStackTrace();
    }   
        return false;
      } 
        public void deleteBooking(Room room) throws Exception {
try{
        PreparedStatement ps = con.prepareStatement("DELETE FROM Booking WHERE room_no = ? ");
        ps.setInt(1, room.getRoom_no());
        int rowsUpdated = ps.executeUpdate();
        if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(null, "Booking" + room.getRoom_no() + " has been deleted.");
        } else {
            JOptionPane.showMessageDialog(null, "Failed to delete room " + room.getRoom_no() + ".");
        }}
    catch (SQLException e) {
        // Handle any SQL errors here
        e.printStackTrace();
    }
    } 

    public ResultSet getAllRooms() throws Exception {
        MySqlConnection c = new MySqlConnection();
        List<Room> AllRooms = new ArrayList<>();
        ResultSet rs = null;
        Connection con = c.getConnection("Hms");
        Statement st = con.createStatement();
        rs = st.executeQuery("Select *from Room");
        return rs;

    }

}
