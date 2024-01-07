package kr.co.softcampus.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import kr.co.softcampus.beans.JdbcBean;

public interface MapperInterface {

	//컬럼에 이름과 빈의 이름이 동일하다면 아래는 생략해도 된다.
//	@Results({
//		@Result(column = "int_data", property = "int_data"),
//		@Result(column = "str_data", property = "str_data")
//	})
	@Select("select int_data, str_data from jdbc_table")
	List<JdbcBean> select_data();
	
	@Insert("insert into jdbc_table (int_data, str_data) values (#{int_data}, #{str_data})")
	void insert_data(JdbcBean bean);
	
	@Update("update jdbc_table set str_data = #{str_data} where int_data = #{int_data}")
	void update_data(JdbcBean bean);
	
	//매개변수로 받는게 하나면은 변수명이 일치하지 않아두 된다 ex)abc
	@Delete("delete from jdbc_table where int_data =#{abc}")
	void delete_data(int int_data);
}
