/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Rooms;

import java.util.List;

/**
 *
 * @author MANVEER KAUR
 */
public interface Booking_Repo {

    public void addBooking(Booking booking) throws Exception;

    public void cancelBooking(Booking booking) throws Exception;

    public List<Booking> showAllBookings() throws Exception;

    public void UpdateBooking(Booking booking) throws Exception;

    public List<Booking> showBooking(String whereclause) throws Exception;

    public boolean checkCustomerExistence(Booking booking) throws Exception;
    public void addOnlineBooking (Booking booking)throws Exception;
}
