package com.dw.java8update.practice.lambda;



public class LambdaDemo {
	
	private int x=10;
	
	void m2() {
		int y=20;
		Interf i=()->{//Interf has only 1 abstract method and 1 default and 1 static method
			System.out.println(x);//class variable access
			System.out.println(y);//local method variable can be access provided its initialized
			//as the local variable values will be 
			//y=90;//Local variable y defined in an enclosing scope must be final or effectively final
			//n->n*n; //valid
			//n->{return n*n;};//valid
			//n->{return n*n};//invalid
			//(n)->{return n*n};//valid
			//n->{n*n};//valid
		};
		i.m1();
		FInterface1 in= n->  n*n;//if adding return statements we have to add {} and vice versa
		System.out.println(in.squar(10));
	}

	public static void main(String[] args) {
		LambdaDemo lambdaDemo=new LambdaDemo();
		lambdaDemo.m2();
	}
}
