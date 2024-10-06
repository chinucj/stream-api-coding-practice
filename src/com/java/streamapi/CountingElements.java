package com.java.streamapi;

import java.util.Arrays;
import java.util.List;

public class CountingElements {
	
	//Count the number of elements in a list of strings that start with the letter 'A'.
	
	public static Long countElements(List<String> list) {
		return list.stream().filter((x) -> x.startsWith("A")).count();
	}
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Aparna","Smruti","Amit","Sima","Jiban","Kiran","Priyanka","Ankita","Asutosh");
		System.out.println(countElements(list));
	}

}
