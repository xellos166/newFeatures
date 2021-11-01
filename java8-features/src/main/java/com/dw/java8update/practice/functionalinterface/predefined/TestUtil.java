package com.dw.java8update.practice.functionalinterface.predefined;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public interface TestUtil {

	public static Function<Student,Student> changeCase=s-> {
		String  res=s.getName().toUpperCase();
		s.setName(res);
		return s;
	};
	//Supplier
	public static Supplier<List<Student>> getSampleStudentList =()-> {
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("Shiva", 65f));
		studentList.add(new Student("Mahesh", 70f));
		studentList.add(new Student("Sankar", 30f));
		studentList.add(new Student("Bhola", 25f));
		return studentList;
	};
	//Consumer
	static Consumer<Student> displayStudent=s->{
		System.out.println("Name :"+s.getName());
		//Function call to calculateGrade
		System.out.println("Grade :"+FunctionTest.calculateGrade.apply(s));
		System.out.println("Marks :"+s.getMarks());
		
	};
	
	//predicate 
	static Predicate<Student> isFirstClass=s->s.getMarks()>60;
	
	
}
