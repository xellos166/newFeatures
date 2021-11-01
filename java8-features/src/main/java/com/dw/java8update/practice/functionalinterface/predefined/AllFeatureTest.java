package com.dw.java8update.practice.functionalinterface.predefined;

import java.util.List;
import java.util.stream.Collectors;

public class AllFeatureTest {

	public static void main(String[] args) {
		//Suppier call for getting the student List
		List<Student> s = TestUtil.getSampleStudentList.get();
		
		//With stream Predicate and Function both are used
		List<Student> result = s.stream().filter(st -> TestUtil.isFirstClass.test(st))
				//changecase Function call
				.map(student -> TestUtil.changeCase.apply(student)).collect(Collectors.toList());
		
		//Consumer used to display the result
		result.stream().forEach(res -> TestUtil.displayStudent.accept(res));
	}
}
