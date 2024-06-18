/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-defa

/**
 *
 * @author MANVEER KAUR
 */
package Rooms;

import com.mycompany.mavenproject1.MySqlConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Booking_service implements Booking_Repo {

    @Override
    public void addBooking(Booking booking) throws Exception {
        MySqlConnection c = new MySqlConnection();

        Connection con = c.getConnection("Hms");
        PreparedStatement ps = con.prepareStatement("insert into Booking(name,contact,email,room_type,room_no,no_of_persons,price,"
                + "check_in,check_out,days,total_amount,mode_of_Payment,received_amount,pending_amount,id_proof) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        ps.setString(1, booking.getName());
        ps.setString(2, booking.getContact());
        ps.setString(3, booking.getEmail());
        ps.setString(4, booking.getRoom_type());
        ps.setInt(5, booking.getRoom_no());
        ps.setInt(6, booking.getNo_of_Persons());
        ps.setDouble(7, booking.getPrice());
        ps.setString(8, booking.getCheck_in());
        ps.setString(9, booking.getCheck_out());
        ps.setInt(10, booking.getDays());
        ps.setDouble(11, booking.getTotal_amount());
        ps.setString(12, booking.getMode_of_Payment());
        ps.setDouble(13, booking.getReceived_amount());
        ps.setDouble(14, booking.getPending_amount());
        ps.setString(15, booking.getId_proof());
//           ps.setString(16, "");
        ps.executeUpdate();
        con.close();
    }

    @Override
    public void cancelBooking(Booking booking) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Booking> showAllBookings() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void UpdateBooking(Booking booking) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Booking> showBooking(String whereclause) throws Exception {
        MySqlConnection c = new MySqlConnection();

        Connection con = c.getConnection("Hms");
        List<Booking> bookings = new ArrayList<>();
        PreparedStatement ps = con.prepareStatement("select * from booking " + whereclause);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Booking booking = new Booking();
            booking.setCheck_in(rs.getString("check_in"));
            booking.setCheck_out(rs.getString("check_out"));
            booking.setContact(rs.getString("contact"));
            booking.setDays(rs.getInt("days"));
            booking.setEmail(rs.getString("email"));
            booking.setId_proof(rs.getString("id_proof"));
            booking.setMode_of_Payment(rs.getString("mode_of_Payment"));
            booking.setName(rs.getString("name"));
            booking.setPending_amount(rs.getDouble("pending_amount"));
            booking.setTotal_amount(rs.getDouble("total_amount"));
            booking.setReceived_amount(rs.getDouble("received_amount"));
            booking.setNo_of_Persons(rs.getInt("no_of_persons"));
            booking.setRoom_no(rs.getInt("room_no"));
            booking.setRoom_type(rs.getString("Room_type"));
            booking.setBooking_id(rs.getInt("bookingid"));
            bookings.add(booking);
        }
        con.close();
        return bookings;
    }

    @Override
    public boolean checkCustomerExistence(Booking booking) throws Exception {
        MySqlConnection c = new MySqlConnection();
        Connection con = c.getConnection("Hms");

        PreparedStatement ps = con.prepareStatement("select contact from Booking where contact=?");
        ps.setString(1, booking.getContact());
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            con.close();
            return true;
        } else {
            con.close();
            return false;
        }

    }

    @Override
    public void addOnlineBooking(Booking booking) throws Exception {
        MySqlConnection c = new MySqlConnection();

        try (Connection con = c.getConnection("Hms")) {
            PreparedStatement ps = con.prepareStatement("insert into Booking(name,contact,room_no,no_of_persons,price,"
                    + "check_in,check_out,id_proof) values(?,?,?,?,?,?,?,?)");
            ps.setString(1, booking.getName());
            ps.setString(2, booking.getContact());
            ps.setInt(3, booking.getRoom_no());
            ps.setInt(4, booking.getNo_of_Persons());
            ps.setDouble(5, booking.getPrice());
            ps.setString(6, booking.getCheck_in());
            ps.setString(7, booking.getCheck_out());
            ps.setString(8, booking.getId_proof());
//           ps.setString(16, "");
            ps.executeUpdate();
        }
    }
    
    public boolean checkOutByRoomno(Booking booking) throws Exception {
        MySqlConnection c = new MySqlConnection();
        Connection con = c.getConnection("Hms");

        PreparedStatement ps = con.prepareStatement("select room_no from Booking where room_no=?");
        ps.setInt(1, booking.getRoom_no());
        
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            con.close();
            return true;
        } else {
            con.close();
            return false;
        }

    }
}
