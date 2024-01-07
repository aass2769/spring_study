package kr.co.softcampus.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.co.softcampus.mapper.MapperInterface;

@Configuration
@ComponentScan(basePackages = "kr.co.softcampus.beans")
public class BeanConfigClass {

	// data source
	@Bean
	public BasicDataSource dataSource() {
		
		BasicDataSource source = new BasicDataSource();
		source.setDriverClassName("oracle.jdbc.OracleDriver");
		source.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		source.setUsername("c##scott");
		source.setPassword("123456");
		
		return source;
	}
	
	// SqlSessionFactory : SqlSessionFactory는 MyBatis의 핵심 객체로, JDBC 연결 및 SQL 세션을 관리합니다. 
	// 이 메서드는 데이터베이스 연결 정보를 받아와서 SqlSessionFactoryBean을 설정하고 SqlSessionFactory를 생성한 후 반환
	@Bean
	public SqlSessionFactory factory(BasicDataSource source) throws Exception{
		
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		factoryBean.setDataSource(source);
		//source로 설정된 factoryBean을 바탕으로 SqlSessionFactory객체를 생성
		//SqlSessionFactory는  SQL 매핑 및 SQL 세션을 관리하고 MyBatis와 데이터베이스 간의 상호작용을 담당하며 SQL 쿼리를 실행할 때 필요한 세션을 생성한다.
		SqlSessionFactory factory = factoryBean.getObject();
		return factory;
	}
	
	//SqlSessionFactory를 받아와서 MapperFactoryBean을 설정하고, 지정된 인터페이스(MapperInterface)에 대한 MyBatis 매퍼 객체를 생성합니다. 이렇게 생성된 매퍼 객체는 Spring Bean으로 등록된다.
	@Bean
	public MapperFactoryBean<MapperInterface> test_mapper(SqlSessionFactory factory) throws Exception{
		MapperFactoryBean<MapperInterface> factoryBean = new MapperFactoryBean<MapperInterface>(MapperInterface.class);
		factoryBean.setSqlSessionFactory(factory);
		return factoryBean;
	}
}
