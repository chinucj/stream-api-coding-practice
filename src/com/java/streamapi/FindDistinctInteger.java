package com.java.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDistinctInteger {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(11,12,11,24,56,66,24,88,34,98,88,57,24,57);
		System.out.println(findDistinct(list));
	}

	private static List<Integer> findDistinct(List<Integer> list) {
		return list.stream().
				collect(Collectors.groupingBy(Function.identity() , Collectors.counting()))
				.entrySet().stream()
				.filter(entry -> entry.getValue() == 1)
				.map(Entry::getKey).toList();
	}
	
}
/*
 * Algorithm :
 * 1. convert to stream using stream()
 * 2. group the elements into map where key is integer and value will be count of that integer
 * 		using collect(Collectors.groupingBy(Function.identity() , Collectors.counting()))
 * 3. convert the map into set using entrySet() again convert to stream()
 * 4. from that stream filter the element whose value equals to one
 * 5. then map the key using .map(Entry::getKey)
 * 6. convert to list
 * */
