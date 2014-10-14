/**
 * Copyright (c) 2014. CodeGen Ltd. - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 *
 * @author Supun Dharmarathne 
 * @since Oct 14, 2014
 */
package it.codegen.tbx;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect
{
	@Before("execution(* it.codegen.tbx.CustomerBo.addCustomer(..))")
	public void logBefore(JoinPoint joinPoint) {

		System.out.println( "logBefore() is running!" );
		System.out.println( "hijacked : " + joinPoint.getSignature().getName() );
		System.out.println( "******" );
	}

	@After("execution(* it.codegen.tbx.CustomerBo.addCustomer(..))")
	public void logAfter( JoinPoint joinPoint )
	{

		System.out.println( "logAfter() is running!" );
		System.out.println( "hijacked : " + joinPoint.getSignature().getName() );
		System.out.println( "******" );

	}

	@AfterReturning(pointcut = "execution(* it.codegen.tbx.CustomerBo.addCustomerReturnValue(..))", returning = "result")
	public void logAfterReturning( JoinPoint joinPoint, Object result )
	{

		System.out.println( "logAfterReturning() is running!" );
		System.out.println( "hijacked : " + joinPoint.getSignature().getName() );
		System.out.println( "Method returned value is : " + result );
		System.out.println( "******" );

	}

	@AfterThrowing(pointcut = "execution(* it.codegen.tbx.CustomerBo.addCustomerThrowException(..))", throwing = "error")
	public void logAfterThrowing( JoinPoint joinPoint, Throwable error )
	{

		System.out.println( "logAfterThrowing() is running!" );
		System.out.println( "hijacked : " + joinPoint.getSignature().getName() );
		System.out.println( "Exception : " + error );
		System.out.println( "******" );

	}

	@Around("execution(* it.codegen.tbx.CustomerBo.addCustomerAround(..))")
	public void logAround( ProceedingJoinPoint joinPoint ) throws Throwable
	{

		System.out.println( "logAround() is running!" );
		System.out.println( "hijacked method : " + joinPoint.getSignature().getName() );
		System.out.println( "hijacked arguments : " + Arrays.toString( joinPoint.getArgs() ) );

		System.out.println( "Around before is running!" );
		joinPoint.proceed();
		System.out.println( "Around after is running!" );

		System.out.println( "******" );
	}

}