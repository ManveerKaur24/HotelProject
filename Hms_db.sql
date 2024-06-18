CREATE DATABASE IF NOT EXISTS Hms;
USE Hms;
CREATE TABLE IF NOT EXISTS Users(
ID INT auto_increment PRIMARY KEY,
Username varchar(255),
Email varchar(200),
Contact varchar(255),
Address varchar (100),
Password varchar(120),
Confirm_Password varchar(120)

);
Select *from Users;

-- To delete the values from a table--
Delete from Users;  

--  TRUNCATE TABLE statement deletes all data from a table without changing its structure, and resets the auto-increment column value to zero.--
truncate Users;

ALTER TABLE Users
DROP COLUMN Confirm_Password;

INSERT INTO Users (username,Email,Contact,Address,password)
VALUES
( 'admin','admin12@gmail.com','987654321','Punjab','Iamadmin');

CREATE TABLE IF NOT EXISTS admin(
Username varchar(255),
Password varchar(120)
);
INSERT INTO admin (username,password)
VALUES
( 'admin','Iamadmin');

select *from admin;

CREATE TABLE IF NOT EXISTS Booking (
    bookingid INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    contact VARCHAR(255),
    email VARCHAR(255),
    room_type VARCHAR(255),
    room_no INT,
    no_of_persons INT,
    price DOUBLE,
    check_in DATE,
    check_out DATE,
    days INT,
    total_amount DOUBLE,
    mode_of_Payment VARCHAR(255),
    received_amount DOUBLE,
    pending_amount DOUBLE,
    id_proof VARCHAR(255)
);
select *from Booking;

CREATE TABLE IF NOT EXISTS Room(
room_id int auto_increment primary key,
room_no INT ,
room_type varchar(255),
amenities varchar(255),
capacity varchar(255),
price double,
description varchar(255),
status varchar(255)

);

CREATE TABLE IF NOT EXISTS Booking_Payment (
    room_no INT,
    bookingid INT,
    payment_status VARCHAR(255),
    amount_paid double
);
Use Hms;
select *from Room; 
select *from booking;
select *from users;
select *from booking_Payment;