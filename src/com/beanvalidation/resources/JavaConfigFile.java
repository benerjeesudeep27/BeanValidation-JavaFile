package com.beanvalidation.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.beanvalidation.beans.Student;
import com.beanvalidation.validator.StudentValidator;

@Configuration
public class JavaConfigFile {
//	@Bean
//	public StudentValidator createStudentValidator() {
//		StudentValidator stdvalObj = new StudentValidator();
//		return stdvalObj;
//	}
	@Bean
	public Student createStudentObj() {
		Student std = new Student();
		std.setName("Sudeep Banerjee");
		std.setPhoneno("7018914822");
		std.setEmail("sudeep12");
		std.setRollno(159);
		return std;
	}
}
