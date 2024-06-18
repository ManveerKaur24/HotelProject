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
public interface Room_repo {

    public void addRoom(Room room) throws Exception;

//    public boolean checkRoomStatus(int room_no) throws Exception;

    public List<Room> showAllRooms() throws Exception;

    public List<Room> showSpecificRoom(String whereclause) throws Exception;

    public void updateRoom(Room room) throws Exception;

    public void changeRoomStatus(Room room_no) throws Exception;

}
