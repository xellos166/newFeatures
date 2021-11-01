package com.dw.java8update.practice.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {

	
	public static void main(String[] args) {
		List<String> namesList= Stream.of("Jenny","Jhony","Dany").map(String::toUpperCase).collect(Collectors.toList());
	}
}
