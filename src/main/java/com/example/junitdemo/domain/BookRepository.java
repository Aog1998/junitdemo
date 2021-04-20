package com.example.junitdemo.domain;

import com.example.junitdemo.db.MysqlManger;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import java.sql.*;

public class BookRepository {
    Connection conn=null;
    PreparedStatement ps=null;
    ResultSet rs=null;

    public List<Book> find(){
        List<Book> list=new ArrayList<Book>();
        String sql="select * from  book ";
        conn= MysqlManger.getConn();
        try {
            ps=(PreparedStatement) conn.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                Book book=new Book();
                book.setName(rs.getString(2));
                book.setDescription(rs.getString(3));
                list.add(book);

            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return list;
    }

    //根据id查找书籍
    public Book findById(int id){
        Book book =new Book();
        String sql="select * from  book where id = ? ";
        conn= MysqlManger.getConn();
        try {
            ps=(PreparedStatement) conn.prepareStatement(sql);
            ps.setInt(1, id);
            rs=ps.executeQuery();
            while (rs.next()) {
                book.setName(rs.getString(2));
                book.setDescription(rs.getString(3));

            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return book;
    }
}
