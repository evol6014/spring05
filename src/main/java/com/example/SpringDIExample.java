package com.example;

import java.sql.SQLException;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.example.dao.CountryDao;
import com.example.model.Dept;

public class SpringDIExample {

	public static void main(String[] args) throws SQLException {
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:/spring/beans.xml");
		
		Dept dept = ctx.getBean(Dept.class);
		System.out.println(dept);
		
		CountryDao dao = ctx.getBean(CountryDao.class);
		System.out.println(dao);
		System.out.println(dao.selectAll());
		System.out.println(dao.selectAll());
		
		ctx.close();
	}
}
