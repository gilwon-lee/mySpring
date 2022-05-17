package spring.aop.entity;

import org.springframework.stereotype.Component;

@Component
public interface Exam {
	int total();
	float avg();
}
