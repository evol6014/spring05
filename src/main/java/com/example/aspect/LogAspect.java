package com.example.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.apachecommons.CommonsLog;

@Component
@Aspect
@CommonsLog
public class LogAspect {
	
	@Before("within(com.example.dao.CountryDao)")
	public void beforeAdvice(JoinPoint jp) {
		log.info("###########################");
		log.info("@Before " + jp.getSignature());
		log.info("###########################");
	}
	
	@After("within(com.example.dao.CountryDao)")
	public void afterAdvice(JoinPoint jp) {
		log.info("###########################");
		log.info("@@After " + jp.getSignature());
		log.info("###########################");
	}
	
	
}
