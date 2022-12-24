package com.saswat.spring.springaop.aspects;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoginAspect {
	@Before("execution(public * com.saswat.spring.springaop.ProductServiceImpl.multiply(..))")
	public void logBefore(Joinpoint joinpoint) {
		System.out.println("before calling the method");
	}

	@After("execution(public * com.saswat.spring.springaop.ProductServiceImpl.multiply(..))")
	public void logAfter(Joinpoint joinpoint) {
		System.out.println("after the method invocation");
	}
}
