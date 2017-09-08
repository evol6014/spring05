package com.example;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.example.model.Dept;

public class SpringDIExample {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:/spring/beans.xml");
		
		Dept dept = ctx.getBean(Dept.class);
		System.out.println(dept);
		
		
		ctx.close();
	}
}
