package spring.di;

//setting.xml의 자바설정

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import spring.di.entity.Exam;
import spring.di.entity.NewLecExam;

@ComponentScan("spring.di.ui")
@Configuration
public class NewLecDiConfig {

	@Bean
	public Exam exam() {
		return new NewLecExam();
	}
}
