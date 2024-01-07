package kr.co.softcampus.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.co.softcampus.beans.JdbcBean;
import kr.co.softcampus.config.BeanConfigClass;
import kr.co.softcampus.db.JdbcDAO;

public class MainClass {

	public static void main(String[] args) {

		//빈 구성 정보를 로드하고 IoC 컨테이너를 초기화하는 역할
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		//IoC 컨테이너에서 JdbcDAO 타입의 빈을 검색하고 반환하는 메서드입니다. 이 코드는 JdbcDAO 빈을 가져옵니다.
		JdbcDAO dao = ctx.getBean(JdbcDAO.class);
		
//		//insert
//		JdbcBean bean1 = new JdbcBean();
//		bean1.setInt_data(1);
//		bean1.setStr_data("문자열1");
//		dao.insert_data(bean1);
//		
//		JdbcBean bean2 = new JdbcBean();
//		bean2.setInt_data(2);
//		bean2.setStr_data("문자열2");
//		dao.insert_data(bean2);
//		
//		System.out.println("저장완료");
		
//		//update
//		JdbcBean bean4 = new JdbcBean();
//		bean4.setInt_data(1);
//		bean4.setStr_data("문자열3");
//		dao.update_data(bean4);
		
		//delete
		dao.delete_data(1);
		
		
		//select
		List<JdbcBean> list = dao.select_data();
		
		for(JdbcBean bean3 : list) {
			System.out.printf("int_data : %d\n", bean3.getInt_data());
			System.out.printf("int_data : %s\n", bean3.getStr_data());
			System.out.println("-----------------------");
		}
		
		ctx.close();
	}

}
