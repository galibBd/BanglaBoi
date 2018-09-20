/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.dao.DbConnection;
import com.model.Books;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author SAIFUL
 */
@Path("/")
public class RestController {

    @Path("/book")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getName() {
        String bName = "Rest Angular JS";
        return bName;
    }

    @Path("/booklist")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Books> getBooks() {
        List<Books> bookList = new ArrayList<>();
        DbConnection dao = new DbConnection();
        bookList = dao.getAllBooks();
        return bookList;
    }
    
    @Path("/categories")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Books> getcategories() {
        List<Books> catList = new ArrayList<>();
        DbConnection dao = new DbConnection();
        catList = dao.getAllCategories();
        return catList;
    }
    
    @Path("/bookdetails/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Books> getbookdetails(@PathParam("id")int id ) {
        List<Books> book = new ArrayList<>();
        DbConnection dao = new DbConnection();
        book = dao.getBookDetails(id);
        return book;
    }
    
    @Path("/add")
    @POST
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Books addActor(Books book) {
        try {

            if (book != null) {
//                System.out.println("Adding actor with ID: " + book.getId());
                DbConnection db = new DbConnection();
                db.addNewProduct(book);
                System.out.println("Actors are now: " + book);
            } else {
                System.out.println("Inside addActor, Unable to add actors...");
            }
        } catch (Exception ex) {
        }
        return book;
    }

}
