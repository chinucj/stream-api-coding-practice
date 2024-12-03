package com.java.streamapi;

import java.util.Arrays;
import java.util.List;

public class FindStartsWithA {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Chinu","David","Rahul","Saurav","Aparna","Ankita");
		String result = list.stream().filter((x)->x.startsWith("A")).toList().getFirst();
		System.out.println(result);
	}

}
