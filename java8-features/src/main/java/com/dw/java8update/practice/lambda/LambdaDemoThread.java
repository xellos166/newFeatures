package com.dw.java8update.practice.lambda;

public class LambdaDemoThread {

	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Child thread-1");
			}
		});
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main thread-1");
			Thread.sleep(1000);
		}
		
		
		
	}
}
