package com.java.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindSecondHighest {
public static void main(String[] args) {
	List<Integer> numList = Arrays.asList(1,2,3,4,5,5,6,9,10);
	Optional<Integer> num = numList.stream().distinct().sorted((a,b)-> b-a).skip(1).findFirst();
	num.ifPresentOrElse(
            number -> System.out.println("Second highest number: " + number),
            () -> System.out.println("List does not have a second highest number")
    );
}
}
