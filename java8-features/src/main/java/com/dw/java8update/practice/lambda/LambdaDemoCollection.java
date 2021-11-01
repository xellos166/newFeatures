package com.dw.java8update.practice.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.BiFunction;

public class LambdaDemoCollection {
	static BiFunction<Integer, Integer, Integer> random=(min,max)->{return new Random().ints(min,max+1).findFirst().getAsInt();};
	
	
	public static void main(String[] args) {
		
		List<Integer> l=new ArrayList<Integer>();
		for (int i=0;i<20;i++) {
			l.add(random.apply(1, 100));
		}
		System.out.println(l);
		l.stream().sorted(Comparator.reverseOrder()).forEach(x->System.out.print(x+" "));
	}
}
