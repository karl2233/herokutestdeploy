package com.example.rm;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.test.util.karlelements;
public class LastIdInsertRowMapper implements  RowMapper < karlelements > {


	@Override
	public karlelements mapRow(ResultSet rs, int rowNum) throws SQLException {
		//LastInsertId lastInsertId = new LastInsertId();
		
		karlelements karl = new karlelements();
		karl.setDescription(rs.getString("description"));
		karl.setId(rs.getInt("id"));
		//lastInsertId.setLastInsert(rs.getString("LAST_INSERT_ID()"));     
        return karl;
	}
}