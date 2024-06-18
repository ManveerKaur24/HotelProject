package com.mycompany.mavenproject1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
/**
 *
 * @author MANVEER KAUR
 */
public interface UserRepository {

    public void register(Users user) throws Exception;

    public boolean CheckExistence(Users user) throws Exception;

    public void login(Users user) throws Exception;
}
