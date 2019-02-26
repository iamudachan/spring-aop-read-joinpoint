package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

@Aspect
@Component
@Order(2)
public class MyDemoLoggingAspect {

	@Before("com.luv2code.aopdemo.aspect.LvuAopExpressions.excludeSetGetMehosd()")
	public void beforeAddAccountAdvice(JoinPoint theJointPoint) {
		System.out.println("\n=====>>> Executing @Before advice on beforeAddAccountAdvice");
		
		MethodSignature methodSignature = (MethodSignature)theJointPoint.getSignature();
		
		System.out.println("Method : "+methodSignature);
		
		Object org[] = theJointPoint.getArgs();
		
		for(Object tempOrg : org) {
			System.out.println(tempOrg);
			
			if(tempOrg instanceof Account){
				Account tempArg = (Account)tempOrg;
				System.out.println("Account name :"+tempArg.getName());
				System.out.println("Account level :"+tempArg.getLevel());
			}
		}
			
		
		
	}
	
	
}










