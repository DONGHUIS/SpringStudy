package com.hui.edu.aop;

import org.aspectj.lang.JoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DaoLogAop_XML {

	public void before(JoinPoint j) {
		Logger logger = LoggerFactory.getLogger(j.getTarget()+"");
		logger.info("[AOP Logger] Dao 메소드 실행전");	
		Object[] args = j.getArgs();
		
		if(args != null) {
			logger.info("[AOP Logger] {}",j.getSignature().getName());
			for(int i=0;i<args.length;i++) {
				logger.info(i+"번째"+args[i]);
			}
			logger.info("[AOP Logger] {}",j.getSignature().getName());
		}
	}
	
	public void afterReturing(JoinPoint j,Object returnValue) {
		Logger logger = LoggerFactory.getLogger(j.getTarget()+"");
		logger.info("[AOP Logger] 반환결과 : \t {}",returnValue);
	}
	
	public void afterThrowing(JoinPoint j,Exception error) {
		Logger logger = LoggerFactory.getLogger(j.getTarget()+"");
		logger.info("[AOP Logger] 오류 : \t {}",error.getMessage());
	}
}
