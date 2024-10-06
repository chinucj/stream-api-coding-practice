package com.java.streamapi;

import java.util.Arrays;
import java.util.List;

public class FilterOddNumber {

	public static List<Integer> filterOddNumber(List<Integer> numList){
		return numList.stream().filter((x) -> x%2 != 0).toList();
	}
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		System.out.println(filterOddNumber(list));
	}
}
