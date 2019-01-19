package org.fcap.example.cxfendpointtest.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;


@Aspect
@Configuration
public class ValidateWSAspect {

	@Pointcut("execution(* org.fcap.example.cxfendpointtest.impl.HelloWorldWebService.*(..))")
	public void validateForAllWsMethods(){}


	@Around("validateForAllWsMethods()")
	public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		long startTime = System.currentTimeMillis();

		proceedingJoinPoint.proceed();

		long timeTaken = System.currentTimeMillis() - startTime;

		System.out.println("joinPoint = [" + proceedingJoinPoint + "]");
		System.out.println("timeTaken = [" + timeTaken + "]");
	}
}