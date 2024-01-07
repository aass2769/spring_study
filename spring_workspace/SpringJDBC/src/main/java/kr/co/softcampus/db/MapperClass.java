package kr.co.softcampus.db;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import kr.co.softcampus.beans.JdbcBean;

@Component
//RowMapper 인터페이스는 SQL 쿼리의 결과 집합을 Java 객체로 매핑하는 역할
public class MapperClass implements RowMapper<JdbcBean>{

	@Override
	public JdbcBean mapRow(ResultSet rs, int rowNum) throws SQLException {

		JdbcBean bean = new JdbcBean();
		bean.setInt_data(rs.getInt("int_data"));
		bean.setStr_data(rs.getString("str_data"));
		
		return bean;
	}
}
