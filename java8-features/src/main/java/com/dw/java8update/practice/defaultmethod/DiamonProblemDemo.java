package com.dw.java8update.practice.defaultmethod;


interface Left{
	
	default void m1() {
		System.out.println("m1 from Left");
	}
}
interface Right{
	
	default void m1() {
		System.out.println("m1 from Right");
	}
}


public class DiamonProblemDemo implements Left,Right{
	//We have to implement the common default method as
	//Duplicate default methods named m1 with the parameters () and () are inherited from the types Right and Left


	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("Own m1 implementation");
		Left.super.m1();//if we want left feature in implementation
		Right.super.m1();//if we want right feature in implementation
	}
	public static void main(String[] args) {
		DiamonProblemDemo d=new DiamonProblemDemo();
		d.m1();
	}
}
