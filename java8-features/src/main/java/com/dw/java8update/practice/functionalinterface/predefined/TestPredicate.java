 
package com.dw.java8update.practice.functionalinterface.predefined;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class TestPredicate {
	// check a String length is greater than 5 or not
	static Predicate<String> ps = s -> s.length() > 5;

	public static void main(String[] args) {

		String[] stringArr = { "Ola", "Hello", "Namaste", "thank you" };
		// Streams on Arrays
		Arrays.stream(stringArr).forEach(item -> System.out.println(ps.test(item)));

		// Predicate with Custom classes
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Shiva", 2000));
		empList.add(new Employee("Mahesh", 7000));
		empList.add(new Employee("Sankar", 6000));
		empList.add(new Employee("Bhola", 5000));

		Predicate<Employee> empPredicate = e -> e.getSalary() > 4000;
		Predicate<Employee> empNameCheck = e -> e.getName().length() > 5;
		empList.stream().forEach(e -> {
			// predicate joining
			if (empPredicate.and(empNameCheck).test(e)) {
				System.out.println(e.getName() + ":" + e.getSalary());
			}
		});
		
		//BiPredicate
		BiPredicate<Employee, Employee> biEmpPredicate=(e1,e2)-> e1.getSalary()<e2.getSalary();
		System.out.println(biEmpPredicate.test(new Employee("Shiva", 2000), new Employee("Mahesh", 7000)));

	}

}

class Employee {
	private String name;
	private double salary;

	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

}