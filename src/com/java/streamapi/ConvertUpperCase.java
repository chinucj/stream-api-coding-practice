package com.java.streamapi;

import java.util.Arrays;
import java.util.List;

public class ConvertUpperCase {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Chinu","David","rahul","saurav");
		List<String> result = list.stream().map((x)->x.toUpperCase()).toList();
		System.out.println(result);
	}

}
