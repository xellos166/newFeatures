
package com.dw.java8update.practice.functionalinterface.predefined;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
//Predicate ->1 input,1 boolean output
//BiPredicate->2 input,1 boolean output----->test()

//Function->1 input any Type,1 output any Type---->apply()
//BiFunction->2 " 	"	"	,1 output any Type

//Consumer-> 1 "	"	"	,no output ---->accept()
//BiConsumer->2 "	"	"	,no output
 
//Supplier->no input,on explicite output
public class FunctionTest {
	// check and return length uppercase String
	private static Function<String, String> strFunc = s -> s.toUpperCase();

	public static void main(String[] args) {

		String[] stringArr = { "Ola", "Hello", "Namaste", "thank you" };
		Arrays.stream(stringArr).forEach(st -> System.out.println(strFunc.apply(st)));
		
		
		Function<Integer, Integer> doubleNumber=n->2*n;
		Function<Integer,Integer> qube=n->n*n*n;
		//Function Chaining
		System.out.println(doubleNumber.andThen(qube).apply(2));
		//reverse order
		System.out.println(doubleNumber.compose(qube).apply(2));
		

		// Predicate with Function
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("Shiva", 65f));
		studentList.add(new Student("Mahesh", 70f));
		studentList.add(new Student("Sankar", 30f));
		studentList.add(new Student("Bhola", 25f));
		studentList.stream().forEach(s -> {
			if (marksGreter.test(s)) {
				System.out.println("Student Name :" + s.getName() + "|Marks :" + s.getMarks() + "| Grade :"
						+ calculateGrade.apply(s));
			}
		});

	}

	// Function using custom object
	public static Function<Student, String> calculateGrade = s -> {
		String res = "";
		float marks = s.getMarks();
		if (s.getMarks() > 80.00)
			res = "A[Distiction]";
		else if (s.getMarks() > 60.00)
			res = "A";
		else if (s.getMarks() > 40)
			res = "B";
		else
			res = "Failed";
		return res;

	};
	public static Predicate<Student> marksGreter = s -> s.getMarks() > 60;

}

