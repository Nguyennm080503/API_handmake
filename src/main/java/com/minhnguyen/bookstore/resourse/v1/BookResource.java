/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.minhnguyen.bookstore.resourse.v1;

import com.minhnguyen.bookstore.dto.Book;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
@Path("v1/books")
public class BookResource {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> getBook(){
        ArrayList<Book> books = new ArrayList<>();
        books.add( new Book("B1", "Đời ngắn đừng ngủ dài", "Japan", 2, 2008));
        books.add( new Book("B1", "Đời ngắn đừng ngủ dài", "Japan", 2, 2008));
        books.add( new Book("B1", "Đời ngắn đừng ngủ dài", "Japan", 2, 2008));
        return books;
    }
}
