package edu.java.ojdbc.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import edu.java.ojdbc.model.Blog;
import oracle.jdbc.driver.OracleDriver;

import static edu.java.ojdbc.OracleJdbc.*;
import static edu.java.ojdbc.controller.JdbcSql.*;
import static edu.java.ojdbc.model.Blog.Entity.*;

public class BlogDaoImpl implements BlogDao {
    
    // Singleton 적용
    private static BlogDaoImpl instance = null;
    
    private BlogDaoImpl() {}
    
    public static BlogDaoImpl getInstance() {
        if (instance == null) {
            instance = new BlogDaoImpl();
        }
        
        return instance;
    }

    private Connection getConnection() throws SQLException {
        DriverManager.registerDriver(new OracleDriver());

        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    private void closeResources(Connection conn, Statement stmt) throws SQLException {
        stmt.close();
        conn.close();
    }

    private void closeResources(Connection conn, Statement stmt, ResultSet rs) 
            throws SQLException {
        rs.close();
        closeResources(conn, stmt);
    }
    
    @Override
    public List<Blog> select() {
        List<Blog> list = new ArrayList<>(); // 리턴하기 위한 ArrayList - select의 결과를 저장.
        
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = getConnection(); // Oracle DB와 연결(접속)
            
            System.out.println(SQL_SELECT_ALL);
            stmt = conn.prepareStatement(SQL_SELECT_ALL); // SQL 문장 준비
            
            rs = stmt.executeQuery(); // SQL 문장 실행
            while (rs.next()) { // ResultSet에 row 데이터가 있으면
                // row에서 각 column에 있는 값들을 분석.
                Integer blogNo = rs.getInt(COL_BLOG_NO);
                String title = rs.getString(COL_TITLE);
                String content = rs.getString(COL_CONTENT);
                String author = rs.getString(COL_AUTHOR);
                LocalDateTime created = rs.getTimestamp(COL_CREATED_DATE).toLocalDateTime();
                LocalDateTime modified = rs.getTimestamp(COL_MODIFIED_DATE).toLocalDateTime();
                
                // Blog 타입 객체 생성.
                Blog blog = new Blog(blogNo, title, content, author, created, modified);
                list.add(blog); // 결과 ArrayList에 추가.
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                closeResources(conn, stmt, rs);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        return list;
    }

    @Override
    public Blog select(Integer blogNo) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int insert(Blog blog) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int update(Blog blog) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int delete(Integer blogNo) {
        // TODO Auto-generated method stub
        return 0;
    }

}
