package com.java.streamapi;

import java.util.Arrays;
import java.util.List;

public class CalculateSumOfListOfNumbers {

	public static Integer calcSum(List<Integer> list) {
		return list.stream().mapToInt(x->x).sum();
	}
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		System.out.println(calcSum(list));
	}

}
