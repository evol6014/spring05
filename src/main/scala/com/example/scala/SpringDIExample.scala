package com.example.scala

import org.springframework.context.support.GenericXmlApplicationContext
import com.example.model.Dept

object SpringDIExample {
	def main(args: Array[String]): Unit = {
		
		var ctx = new GenericXmlApplicationContext("classpath:/spring/beans.xml")
		
		var dept = ctx.getBean(new Dept().getClass)
		println(dept)
		
		ctx.close()
	}
}