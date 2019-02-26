package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class MyCloudLogAsyncAspect {

	@Before("com.luv2code.aopdemo.aspect.LvuAopExpressions.excludeSetGetMehosd()")
	public void logOrder() {
		System.out.println("\n=====>>> Executing @Before advice on logOrder ");
	}
}
