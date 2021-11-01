
package com.dw.java8update.practice.functionalinterface.predefined;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ConsumerTest {
	// check and return length uppercase String
	private static Function<String, String> strFunc = s -> s.toUpperCase();

	public static void main(String[] args) {

		
		// Predicate with Function and consumer
		//Supplier Call
		List<Student> studentList=TestUtil.getSampleStudentList.get();
		studentList.stream().forEach(s -> {
			if (FunctionTest.marksGreter.test(s)) {
				con.accept(s);
			}
		});
		
		

	}

	//consumer definition
	private static Consumer<Student> con=s->{
		System.out.print("Name :"+s.getName());
		System.out.print("Marks :"+s.getMarks());
		System.out.print("Grade :"+FunctionTest.calculateGrade.apply(s));
		System.out.println();
	};
	
	

}

