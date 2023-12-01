package com.example.dao;


import com.example.bean.BoardVO;
import com.example.util.JDBCUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Repository
public class BoardDAO {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public int insertBoard(BoardVO vo) {

        String sql = "insert into BOARD (title, writer, content, category) values ("
                + "'" + vo.getTitle() + "',"
                + "'" + vo.getWriter() + "',"
                + "'" + vo.getContent() + "')";
        return jdbcTemplate.update(sql);
    }

    
}
