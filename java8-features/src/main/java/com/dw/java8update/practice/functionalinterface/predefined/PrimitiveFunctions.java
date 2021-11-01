package com.dw.java8update.practice.functionalinterface.predefined;

import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;

public class PrimitiveFunctions {

	public static void main(String[] args) {

		// General Function
		Function<String, Integer> strLen = s -> s.length();

		// Return type not required as it will be primitive,but input type is required
		// When output is any primitive and input is not a wrapper type
		ToIntFunction<String> strLenPrimitive = s -> s.length();
		
		//2 Input types required but primitive Int return type is not required
		ToIntBiFunction<String, String> lengthCount=(s1,s2)->s1.length()+s2.length();

		System.out.println(strLen.apply("Hello World"));
		System.out.println(strLenPrimitive.applyAsInt("Hello World!"));

		//// Input type is not required as it will be primitive,,but return type is
		//// required
		IntFunction<String> retIntAsString = i -> String.valueOf(i);
		System.out.println(retIntAsString.apply(100));

	}

}
