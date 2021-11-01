package com.dw.java8update.practice.functionalinterface.predefined;

public class Student {
	private float marks;
	private String name;

	public Student(String name, float marks) {
		super();
		this.marks = marks;
		this.name = name;
	}

	public float getMarks() {
		return marks;
	}

	public String getName() {
		return name;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
