package com.dw.java8update.practice.functionalinterface.predefined;

import java.util.LinkedHashMap;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class SpecializedOperatorDemo {
	public static void main(String[] args) {
		
		//Function<T,T,T>
		//This is a specialization of BiFunction 
		//for the case where the operands and the result are all ofthe same type. 
		BinaryOperator<String> concat=(s1,s2)->s1+" "+s2;
		
		//Function<T,T>
		UnaryOperator<String> unaryUpperCase=s-> s.toUpperCase();
		LinkedHashMap l;
	}
}
