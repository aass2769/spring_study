# :page_with_curl:Study
Spring을 공부하며 각 프로젝트를 구분하고 정리했습니다.<br><br><br><br>
#  :file_folder:Project
:heartpulse: 1.JavaBasic_01 : 자바 프로젝트의 문제점 - 클래스가 변경되면 객체 생성 부분과 참조 변수 선언 모두 수정해야함.<br><br>
:green_heart: 2.Polymophism : 다형성의 문제점 - 참조변수는 수정하지 않아도 되지만 객체 생성 코드는 변경해야 함.<br><br>
:blue_heart: 3.SpringBasic : beans.xml과 pom.xml, maven 적용법 등 스프링 기본 프로젝트 작성<br><br>

 ## :heavy_check_mark: IoC :heavy_check_mark:
:heartpulse: 4.IoC : 제어 역전 - beans.xml에 bean을 작성하고 XmlBeanFactory와 ApplicationContext(IoC 컨테이너)를 이용한<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 패키지 내.외부 Bean 객체 관리<br><br>
:green_heart: 5.BeanCreate : bean에 속성. id, class, lazy-init, scope. lazy-init은 getBean()을 통해 객체를 생성할 건지 정할 수 있다.<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; lazy-init을 true로 하지않으면 객체는 자동 생성된다.<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; scope="prototype"으로 singleton이 아닌 getBean()떄마다 객체 생성을 할 수 있다.<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; singleton은 객체를 하나만 생성하여 쓰고 prototype은 객체를 getBean()할 때마다 생성한다.<br><br>
:blue_heart: 6.BeanLifeCycle : init-method, destroy-method 와 default-init-method와 default-destroy-method로 Bean객체의 생명주기를 조절할 수 있다.<br><br>
:purple_heart: 7.BeanPostProcessor : BeanPostProcessor 인터페이스를 구현한 클래스를 정의하면<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Bean객체를 생성할 때 호출될 init-method 호출을 가로채 다른메서드를 호출 할 수 있다.<br><br>
 ## :heavy_check_mark: DI(xml) :heavy_check_mark:

:heartpulse: 8.ConsntructorDI : Bean 객체를 생성할 떄 객체의 기본 값을 생성자를 통해 주입할 수 있다.<br><br>
:green_heart: 9.SetterDI : Bean 객체를 생성할 때 객체의 기본 값을 Setter 메서드를 통해 주입할 수 있다.<br><br>
:blue_heart: 10.CollectionDI : Bean 객체를 생성할 때 주입할 맴버가 컬렉션이라면 컬렉션이 관리할 객체를 주입할 수 있다.<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; List, Map, Set, Property 를 사용한다.<br><br>
:purple_heart: 11.AutoWire : autowire = byName or byType or constructor 를 통한 자동주입과 default-autowire로 자동주입.<br><br>

## :heavy_check_mark: DI(java) :heavy_check_mark:
:heartpulse: 12.JavaBeanConfiguration : 자바 파일을 이용해 @Configuration, @Bean, @Lazy, @ primary 사용해보기.<br><br>
:green_heart: 13.initDestroy : initMethod와 destroyMethod를 이용하여 객체 생성 및 소멸 시 호출 될 메서드를 등록할 수 있다.<br><br>
:blue_heart: 14.JavaDI : 생성자와 setter을 통한 직접주입과 autowire by_name과 by_type을 통한 자동주입(예전 방식)
configuration에서 자동주입함(예전 방식)<br><br>
:purple_heart: 15.AnnotationBean : configuration에서 자동주입하는게 아니라<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; bean클래스에서 autowired 시킴(최근방식)
		xml과 java를 사용한 필드, 생성자, setter 자동주입.<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; xml에서 autowire를 사용하려면 xml에 <context:annotation-config/>태그를 사용해야함<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; xml에서 생성자 자동주입을 할 때는 autowired를 쓰지 않아도 자동주입됨<br><br>
:heartpulse: 16.JSR-250 : 어노테이션을 추가적으로 사용할 수 있으며, 빈에서 @PostConstruct로 생성자 호출 이후 자동호출한다.<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; @PreDestroy로 객체가 소멸되기 전에 자동으로 호출한다.<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; @Resource로 타입으로 자동주입하는 Autowired와 Qualifier 설정 대신 이름으로 자동주입 할 수 있다.<br><br>
:green_heart: 17.Component : @Component를 사용하면 Bean Configuration에 @Bean을 정의하지 않아도 자동등록된다.<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; @Component를 사용할 때 xml이라면 <context:component-scan base-package="kr.co.softcampus.beans2"/> 이와 같이,<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Configuration file이라면 @ComponentScan(basePackages = "kr.co.softcampus.beans2")같이 등록한다.<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 하나의 클래스를 여러 이름을 주어서 사용할 떄는 @Component을 쓰지 않는다.<br><br>

:blue_heart: 18.ComponentSetting : @Component("t3")로 이름을 설정할 수 있고, @Lazy로 getBean시 객체를 생성할 수있고,<br> 
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; @Scope("prototype")로 prototype으로 지정할 수 있다.<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; @PostConstruct와 @PreDestroy로 생성자 호출 후, 객체 소멸 전 메서드를 호출 할 수 있다.<br><br>

:purple_heart: 19.ComponentAutowired: Component 자동주입.<br><br>

:heartpulse: 20.AOPXML : xml을 이용한 AOP적용방법
	POM파일에 org.aspectj 라이브러리를 적용하고,<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; before, after, around, afterReturning, afterThrowing을 사용가능하다.<br><br>

:green_heart: 21.executionDirective : expression="execution()"를 통해 aop를 적용할 디렉토리를 설정한다.<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 반환타입, 모든패키지, 모든클래스, 모든메서드, 매개변수 설정 가능하다.<br><br>

:blue_heart: 22.AOPJava : java어노테이션을 활용해 aop를 적용하는 방법.<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; xml 파일에는 <aop:aspectj-autoproxy/>,
BeanConfig설정파일에는 @EnableAspectJAutoProxy,
advisor 클래스에는 @Aspect를 설정한다.<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; advisor 메서드에 @Before(), @After(), @Around(), @AfterReturning(), @AfterThrowing()등의 어노테이션을 사용하며,<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ()에 "execution(* method1())"와 같이 포인트컷의 실행 지점을 설정한다.<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Around advisor을 사용할 때는 메서드에 ProceedingJoinPoint pjp를 매개변수로 사용하고 throws를 날리며,<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 메서드 구현, 관심사메서드 ex)Object result = pjp.proceed();, 메서드 구현으로 사용한다.<br><br>

:purple_heart: 23.SpringJDBC : BeanConfigClass 설정하고, Class에서 BasicDataSource로 연결정보를 설정한 객체를 리턴하고,<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; JdbcTemplate으로 db에 접속해서 쿼리 전달하는 빈을 등록한다.<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; DAO에서 JdbcTemplate 객체를 사용하고, update메서드를 사용해insert,update,delete하며,<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; query메서드를 사용하고 메퍼를 사용해 selete한다.<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; mapper는 RowMapper를 구현하는데 sql쿼리의 결과 집합을 java객체로 매핑해준다.<br><br>

:heartpulse: 24.MyBatis : MyBatis를 사용하여 mapper에서 더 쉽게 db와 연동 가능하다.<br><br>
