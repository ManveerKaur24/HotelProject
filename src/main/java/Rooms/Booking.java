/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbult.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */




//nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
package Rooms;


/**
 *
 * @author MANVEER KAUR
 */
public class Booking {

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String Contact) {
        this.Contact = Contact;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getRoom_type() {
        return Room_type;
    }

    public void setRoom_type(String Room_type) {
        this.Room_type = Room_type;
    }

    public int getRoom_no() {
        return Room_no;
    }

    public void setRoom_no(int Room_no) {
        this.Room_no = Room_no;
    }

    public int getNo_of_Persons() {
        return No_of_Persons;
    }
   
     
    public void setNo_of_Persons(int No_of_Persons) {
        this.No_of_Persons = No_of_Persons;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public String getCheck_in() {
        return Check_in;
    }

    public void setCheck_in(String Check_in) {
        this.Check_in = Check_in;
    }

    public String getCheck_out() {
        return Check_out;
    }

    public void setCheck_out(String Check_out) {
        this.Check_out = Check_out;
    }

    public int getDays() {
        return Days;
    }

    public void setDays(int Days) {
        this.Days = Days;
    }

    public double getTotal_amount() {
        return Total_amount;
    }

    public void setTotal_amount(double Total_amount) {
        this.Total_amount = Total_amount;
    }

    public String getMode_of_Payment() {
        return Mode_of_Payment;
    }

    public void setMode_of_Payment(String Mode_of_Payment) {
        this.Mode_of_Payment = Mode_of_Payment;
    }

    public double getReceived_amount() {
        return Received_amount;
    }

    public void setReceived_amount(double Recieved_amount) {
        this.Received_amount = Recieved_amount;
    }

    public double getPending_amount() {
        return Pending_amount;
    }

    public void setPending_amount(double Pending_amount) {
        this.Pending_amount = Pending_amount;
    }

    public String getId_proof() {
        return Id_proof;
    }

    public void setId_proof(String Id_proof) {
        this.Id_proof = Id_proof;
    }
    private String Name;
    private String Contact;
    private String Email;
    private String Room_type;
    private int Room_no;
    private int No_of_Persons;
    private double Price;
    private String Check_in;
    private String Check_out;
    private int Days;
    private double Total_amount;
    private String Mode_of_Payment;
    private double Received_amount;
    private double Pending_amount;
    private String Id_proof;
    private int Booking_id;

    public int getBooking_id() {
        return Booking_id;
    }

    public void setBooking_id(int Booking_id) {
        this.Booking_id = Booking_id;
    }

}
