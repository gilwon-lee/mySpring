package dipro.di;

import dipro.di.entity.Exam;
import dipro.di.entity.NewLecExam;
import dipro.di.ui.ExamConsole;
import dipro.di.ui.GridExamConsole;
import dipro.di.ui.InlineExamConsole;

public class Progaram {

	public static void main(String[] args) {
		Exam exam = new NewLecExam();
		
//		ExamConsole console = new InlineExamConsole(exam)//DI
		ExamConsole console = new GridExamConsole(exam); //DI
		console.print();

	}

}
