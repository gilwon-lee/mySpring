package spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.aop.entity.Exam;
import spring.aop.entity.NewLecExam;

public class Program {

	public static void main(String[] args) {
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring/aop/setting.xml");
		
//		Exam exam = new NewLecExam(1,1,1,1);
		Exam proxy = (Exam)context.getBean("proxy");
//		System.out.println("total is "+exam.total());
		System.out.println("total is "+proxy.total());
		System.out.println("avg is "+proxy.avg());
		
		
//		자바 AOP 구현
//		Proxy.newProxyInstance(실질적인 객체, 구현 할 인터페이스들 모음, InvocationHandler())
//		Exam proxy = (Exam) Proxy.newProxyInstance(NewLecExam.class.getClassLoader(),
//				new Class[] {Exam.class},
//				new InvocationHandler() {
//					
//					@Override
//					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//						
//						long start = System.currentTimeMillis();
//						
//						int result = kor+eng+math+com;
//						try {
//						Thread.sleep(200);
//						}catch(InterruptedException e){
//							e.printStackTrace();
//						}
//						실제 실행 클래스(함수)
//						Object result =  method.invoke(exam, args);
//						
//						long end = System.currentTimeMillis();
//						String message = (end-start)+ "ms 시간" ;
//						System.out.println(message);
//						
//						return result;
//					}
//				});
		


	}

}
