package kr.co.softcampus.db;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.co.softcampus.beans.JdbcBean;

@Component
public class JdbcDAO {

	//JDBC 관리 객체를 주입 받는다.
	//Spring JDBC 프레임워크의 일부로, JDBC(Java Database Connectivity)를 사용하여 데이터베이스에 쉽게 접근할 수 있도록 도와주는 유틸리티 클래스
	@Autowired
	private JdbcTemplate db;
	
	//Mapper를 주입받는다.
	//데이터베이스와 객체 간의 매핑 또는 변환을 담당하는 클래스
	@Autowired
	private MapperClass mapper;
	
	//저장
	public void insert_data(JdbcBean bean) {
		String sql="insert into jdbc_table (int_data, str_data) values (?, ?)";
		db.update(sql, bean.getInt_data(), bean.getStr_data());
	}
	
	//가져오기
	public List<JdbcBean> select_data(){
		String sql="select int_data, str_data from jdbc_table";
		List<JdbcBean> list = db.query(sql, mapper);
		return list;
	}
	
	//수정
	public void update_data(JdbcBean bean) {
		String sql="update jdbc_table set str_data = ? where int_data = ?";
		db.update(sql, bean.getStr_data(), bean.getInt_data());
	}
	
	//삭제
	public void delete_data(int int_data) {
		String sql="delete from jdbc_table where int_data = ?";
		db.update(sql, int_data);
	}
}
