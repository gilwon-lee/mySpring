package spring.di;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.entity.NewLecExam;
import spring.di.ui.ExamConsole;



public class Progaram {

	public static void main(String[] args) {
		
//		스프링에게 지시하는 방법으로 코드 변경
//		Exam exam = new NewLecExam();
//		ExamConsole console = new GridExamConsole(); //DI
//		
//		console.setExam(exam);
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring/di/setting.xml");
		//ExamConsole console =(ExamConsole) context.getBean("console");
//		Exam exam = context.getBean(Exam.class);
//		System.out.println(exam.toString());
		ExamConsole console =context.getBean(ExamConsole.class);
		console.print();

//		List<Exam> exams =new ArrayList<>();
//		List<Exam> exams = (List<Exam>) context.getBean("exams");
//		exams.add(new NewLecExam(1,1,1,1));
		
//		for(Exam e : exams)
//			System.out.println(e);
	}

}
