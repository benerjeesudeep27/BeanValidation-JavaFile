package com.beanvalidation.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.beanvalidation.beans.Student;
public class StudentValidator implements Validator {
	
	@Override
	public boolean supports(Class<?> clazz) {
		boolean b = Student.class.equals(clazz);
		return b;
	}

	@Override
	public void validate(Object obj, Errors errors) {

		Student stud = (Student) obj;
		if (stud.getName().equals(null) || stud.getName().equals("")) {
			errors.rejectValue("name", "key_name", "Name can not be empty");
		}
		if (stud.getRollno() <= 0) {
			errors.rejectValue("rollno", "key_rollno", "Roll no can not be 0 or -ve");
		}
		if (stud.getPhoneno().length() != 10) {
			errors.rejectValue("phoneno", "key_phoneno", "Phone no is invalid");
		}
		if (stud.getEmail().equals(null) || stud.getEmail().equals("")) {
			errors.rejectValue("name", "key_name", "Email can not be empty");
		}
	}

}
