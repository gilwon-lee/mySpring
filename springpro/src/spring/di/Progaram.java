package spring.di;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.ui.ExamConsole;



public class Progaram {

	public static void main(String[] args) {
		
//		스프링에게 지시하는 방법으로 코드 변경
//		Exam exam = new NewLecExam();
//		ExamConsole console = new GridExamConsole(); //DI
//		
//		console.setExam(exam);
		
//		xml기반 config를 불러오기
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring/di/setting.xml");
		
//		jav기반 config를 불러오기
//		ApplicationContext context =
//				new AnnotationConfigApplicationContext(NewLecDiConfig.class);
		
//		매핑한 id로 불러오기
		ExamConsole console =(ExamConsole) context.getBean("console");
//		Exam exam = context.getBean(Exam.class);
//		System.out.println(exam.toString());
//		ExamConsole console =context.getBean(ExamConsole.class);
		console.print();

//		List<Exam> exams =new ArrayList<>();
//		exams.add(new NewLecExam(1,1,1,1));
		
//		xml에서 만든 List 불러오기
		List<Exam> exams = (List<Exam>) context.getBean("exams");
		for(Exam e : exams)
			System.out.println(e);
	}

}
