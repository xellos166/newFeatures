package com.dw.java8update.practice.defaultmethod;


interface I{
	void m1();
	default void m2() {
		System.out.println("Default method");
	}
	
	//default int hashCode() {return 10;}//invalid 
										//A default method cannot override a method from java.lang.
}


public class DefaultDemo implements I{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void m2() {//Default method implementation always should be public as default modifier not allowed inside class
		System.out.println("Overriden default method");
		
	}
	public static void main(String[] args) {
		DefaultDemo d=new DefaultDemo();
		d.m2();
	}

}
