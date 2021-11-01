package com.dw.java8update.practice.interface8.staticmethod;

interface In {
	public static void m1() {
		System.out.println("Interface Static method");
	}
}

public class StaticDemo implements In {
	public static void main(String[] args) {
		In.m1();
		StaticDemo s=new StaticDemo();
		//s.m1();//invalid 
		//StaticDemo.m1();//invalid
	}
}
