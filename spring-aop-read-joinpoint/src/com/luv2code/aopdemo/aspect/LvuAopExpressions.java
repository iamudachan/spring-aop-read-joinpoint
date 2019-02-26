package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
public class LvuAopExpressions {
	
	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.*(..))")
	public void forDaoClasses(){}	
	
	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.set*(..))")
	public void setMethods(){}	
	
	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.get*(..))")
	public void getMethods(){}	
	
	@Pointcut("forDaoClasses() && !(setMethods() || getMethods())")
	public void excludeSetGetMehosd(){}
	

}
