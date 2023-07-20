package com.lookout.rest.training.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	//@Around("@annotation(Logging)")
    public Object trace(ProceedingJoinPoint joinPoint) throws Throwable {
		 System.out.println("Input :\n" + joinPoint.getArgs()[0]);
	     Object result = joinPoint.proceed();
	     System.out.println(result);
	     return result;
    }
	
	//@Before("@annotation(Logging)")
    public void traceBefore() throws Throwable {
		 System.out.println("Before........................");
    }
	
	@After("@annotation(Logging)")
    public void traceAfter() throws Throwable {
		 System.out.println("After........................");
    }

}
