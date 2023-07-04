/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.minhnguyen.bookstore.config;

import jakarta.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

/**
 *
 * @author ADMIN
 */
@ApplicationPath("/api")
public class BookStoreApplication extends ResourceConfig{

    public BookStoreApplication() {
        packages("com.minhnguyen.bookstore.resourse"); // ten cua pac chua nhung class xu li json
    }
// class dieu phoi luong xu li api den cac class khac co nhiem vu xu li json,db neu can
// class nay ban cac xu li cho cac class khac = class lo json
    
    
}
