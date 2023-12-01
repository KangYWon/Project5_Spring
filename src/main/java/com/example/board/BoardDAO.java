package com.example.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class BoardDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public int insertBoard(BoardVO vo){
        String sql = "insert into BoardSpring (title, writer, content, category) values ("
                + "'" + vo.getTitle() + "',"
                + "'" + vo.getWriter() + "',"
                + "'" + vo.getContent() + "',"
                + "'" + vo.getCategory() + "')";
        return jdbcTemplate.update(sql);
    }

    public int deleteBoard(int seq){
        String sql = "delete from BoardSpring where seq = " + seq;
        return jdbcTemplate.update(sql);
    }

    public int updateBoard(BoardVO vo) {
        String sql = "UPDATE BoardSpring SET "
                + "title = '" + vo.getTitle() + "', "
                + "writer = '" + vo.getWriter() + "', "
                + "content = '" + vo.getContent() + "', "
                + "category = '" + vo.getCategory() + "' "
                + "WHERE seq = " + vo.getSeq();
        return jdbcTemplate.update(sql);
    }


    /*public List<BoardVO> getBoardList(){
        String sql = "select * from BoardSpring order by seq desc";
        List<BoardVO> list = jdbcTemplate.query(sql, new RowMapper<BoardVO>() {
            @Override
            public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException {
                BoardVO vo = new BoardVO();
                vo.setSeq(rs.getInt("seq"));
                vo.setTitle(rs.getString("title"));
                vo.setContent(rs.getString("content"));
                vo.setCategory(rs.getString("category"));
                vo.setRegdate(rs.getDate("regdate"));
                return vo;
            }
        });
        return list;
    }*/

    public BoardVO getBoard(int seq){
        String sql = "select * from BoardSpring where seq=" + seq;
        return jdbcTemplate.queryForObject(sql, new BoardRowMapper());
    }

    public List<BoardVO> getBoardList(){
        String sql = "select * from BoardSpring order by regdate desc";
        return jdbcTemplate.query(sql, new BoardRowMapper());
    }


}

