package spring.aop.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LogAroundAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		
		System.out.println("앞 뒤에서 실행될 로직");
		
		long start = System.currentTimeMillis();
//		Object result =  method.invoke(exam, args);
		Object result = invocation.proceed();
		
		long end = System.currentTimeMillis();
		String message = (end-start)+ "ms 시간" ;
		System.out.println(message);
		
		return result;
	}
	
}
