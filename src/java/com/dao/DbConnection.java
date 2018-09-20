/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.Books;
import java.io.File;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;

/**
 *
 * @author SAIFUL
 */
public class DbConnection {

    public Connection getConnection() throws Exception {
        try {
            Connection con = null;
            String url = "jdbc:mysql://localhost:3306/bangla_boi";
            String driver = "com.mysql.jdbc.Driver";
            String user = "root";
            String password = "root";

            Class.forName(driver).newInstance();
            con = DriverManager.getConnection(url, user, password);
            return con;
        } catch (SQLException e) {
            throw e;
        }
    }

    public List<Books> getAllBooks() {
        PreparedStatement pstm = null;
        ResultSet rs = null;
        List<Books> bookList = new ArrayList<>();
        try {
            Connection con = this.getConnection();
            try {
                pstm = con.prepareStatement("select * from books");
                rs = pstm.executeQuery();
                while (rs.next()) {
                    Books book = new Books();
                    book.setId(Integer.valueOf(rs.getString("id")));
                    book.setName(rs.getString("name"));
                    book.setWriter(rs.getString("writer"));
                    book.setCategory(rs.getString("category"));
                    book.setSize(rs.getString("size"));
                    book.setLength(rs.getString("length"));
                    book.setFileType(rs.getString("file_type"));
                    book.setDescription(rs.getString("description"));
                    book.setMediaFireLink(rs.getString("media_fire_link"));
                    book.setGoogleDrivrLink(rs.getString("google_drive_link"));
                    book.setImgLink(rs.getString("img_link"));
                    bookList.add(book);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return bookList;
    }

    public List<Books> getAllCategories() {
        PreparedStatement pstm = null;
        ResultSet rs = null;
        List<Books> catList = new ArrayList<>();
        try {
            Connection con = this.getConnection();
            try {
                pstm = con.prepareStatement("select DISTINCT category from books");
                rs = pstm.executeQuery();
                while (rs.next()) {
                    Books cat = new Books();
                    cat.setCategory(rs.getString("category"));
                    catList.add(cat);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return catList;
    }

    public List<Books> getBookDetails(int id) {
        PreparedStatement pstm = null;
        ResultSet rs = null;
        List<Books> bookList = new ArrayList<>();
        try {
            Connection con = this.getConnection();
            try {
                pstm = con.prepareStatement("select * from books where id=" + id);
                rs = pstm.executeQuery();
                while (rs.next()) {
                    Books book = new Books();
                    book.setId(Integer.valueOf(rs.getString("id")));
                    book.setName(rs.getString("name"));
                    book.setWriter(rs.getString("writer"));
                    book.setCategory(rs.getString("category"));
                    book.setSize(rs.getString("size"));
                    book.setLength(rs.getString("length"));
                    book.setFileType(rs.getString("file_type"));
                    book.setDescription(rs.getString("description"));
                    book.setMediaFireLink(rs.getString("media_fire_link"));
                    book.setGoogleDrivrLink(rs.getString("google_drive_link"));
                    book.setImgLink(rs.getString("img_link"));
                    bookList.add(book);

                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return bookList;
    }

    public void addNewProduct(Books book) {
        PreparedStatement ps = null;
        try {
            ps = this.getConnection().prepareStatement("INSERT INTO books (name, writer, category, size, length, file_type,description,media_fire_link,google_drive_link,img_link) VALUES (?,?,?,?,?,?,?,?,?,?)");

            ps.setString(1, book.getName());
            ps.setString(2, book.getWriter());
            ps.setString(3, book.getCategory());
            ps.setString(4, book.getSize());
            ps.setString(5, book.getLength());
            ps.setString(6, book.getFileType());
            ps.setString(7, book.getDescription());
            ps.setString(8, book.getMediaFireLink());
            ps.setString(9, book.getGoogleDrivrLink());
            ps.setString(10, book.getImgLink());
            System.out.println(ps);
            ps.execute();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
    
//    public List<Books> getBooksByCat(String cat) {
//        PreparedStatement pstm = null;
//        ResultSet rs = null;
//        List<Books> bookList = new ArrayList<>();
//        try {
//            Connection con = this.getConnection();
//            try {
//                pstm = con.prepareStatement("select * from books where category = " + cat);
//                rs = pstm.executeQuery();
//                while (rs.next()) {
//                    Books book = new Books();
//                    book.setId(Integer.valueOf(rs.getString("id")));
//                    book.setName(rs.getString("name"));
//                    book.setWriter(rs.getString("writer"));
//                    book.setCategory(rs.getString("category"));
//                    book.setSize(rs.getString("size"));
//                    book.setLength(rs.getString("length"));
//                    book.setFileType(rs.getString("file_type"));
//                    book.setDescription(rs.getString("description"));
//                    book.setMediaFireLink(rs.getString("media_fire_link"));
//                    book.setGoogleDrivrLink(rs.getString("google_drive_link"));
//                    book.setImgLink(rs.getString("img_link"));
//                    bookList.add(book);
//
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        return bookList;
//    }
//
//    public static void main(String[] args) {
//        DbConnection db = new DbConnection();
//
//         List b = db.getAllCategories();
//        System.out.println("books:" + b.toString());
//    }
}
