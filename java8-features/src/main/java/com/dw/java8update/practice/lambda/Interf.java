package com.dw.java8update.practice.lambda;

@FunctionalInterface
public interface Interf {
	public void  m1();
	default void sayHello(String name) {
		System.out.println("Hello "+name);
	}
	
	public static void sayHI() {
		System.out.println("Hi Everyone");
	}
}
