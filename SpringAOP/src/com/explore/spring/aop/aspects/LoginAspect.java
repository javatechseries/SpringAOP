package com.explore.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoginAspect {
	
	
	//@Before("execution(public void addAccount())")
	//@Before("execution(public void com.explore.spring.aop.dao.AccountDAO.addAccount())")
	//@Before("execution(public void add*())")
	//@Before("execution(void add*())")
	//@Before("execution(* add*())")
	//@Before("execution(* add*(com.explore.spring.aop.Account))") -- we are supposed to use fully qualified class name
	//@Before("execution(* add*(com.explore.spring.aop.Account,..))")
	//@Before("execution(* add*(..))")
	//@Before("execution(* add*(com.explore.spring.aop.Account,..))")
	@Before("execution(* com.explore.spring.aop.dao.*.*(..))")
	public void beforeAddAccountAdvice() {
		
		System.out.println(" ===> Executing BeforeAdvice on method");
		
	}

}
