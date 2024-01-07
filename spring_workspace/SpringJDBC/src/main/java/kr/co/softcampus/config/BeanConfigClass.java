package kr.co.softcampus.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@ComponentScan(basePackages = {"kr.co.softcampus.beans", "kr.co.softcampus.db"})
public class BeanConfigClass {

	//DataSource(데이터베이스 연결 정보를 설정하고 관리하는 객체-DBCP)
	@Bean
	public BasicDataSource source() {
		
		BasicDataSource source = new BasicDataSource();
		source.setDriverClassName("oracle.jdbc.OracleDriver");
		source.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		source.setUsername("c##scott");
		source.setPassword("123456");
		
		return source;
	}
	
	//데이터베이스에 접속해서 쿼리를 전달하는 빈을 등록한다.
	@Bean
	public JdbcTemplate db(BasicDataSource source) {
		
		JdbcTemplate db = new JdbcTemplate(source);
		
		return db;
	}
}
