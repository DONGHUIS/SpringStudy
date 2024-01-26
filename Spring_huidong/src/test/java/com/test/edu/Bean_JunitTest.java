package com.test.edu;

import static org.junit.Assert.*;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hui.edu.aop.DaoLogAop_Anno;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class Bean_JunitTest {
	
	@Autowired
	private ApplicationContext context;
	
	@Autowired
	private SqlSessionTemplate session;
	
	@Test
	public void test() {
		BasicDataSource dataSource =  context.getBean("dataSource",BasicDataSource.class);
		assertNotNull(dataSource);
		
		SqlSessionFactory factory 
						=context.getBean("sqlSessionFactoryBean",SqlSessionFactory.class);
		assertNotNull(factory);
		
		//SqlSession session= context.getBean("sqlSessionTemplate",SqlSession.class);
		assertNotNull(session);
		
		DaoLogAop_Anno anno=context.getBean("daoLogAop_Anno",DaoLogAop_Anno.class);
		assertNotNull(anno);
	}

}
