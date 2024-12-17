package com.java.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Cricketers {
	private String name;

	public Cricketers() {
		super();
	}

	public Cricketers(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Cricketers [name=" + name + "]";
	}

}

public class SortByLastName {
	public static void main(String[] args) {
		List<Cricketers> list = Arrays.asList(new Cricketers("rohit Sharma"), new Cricketers("Virat Kohli"),
				new Cricketers("MS Dhoni"), new Cricketers("Sachin Tendulkar"));
		List<Cricketers> sortedList = list.stream().sorted(Comparator.comparing(cricketer -> {
			String[] parts = cricketer.getName().split("\\s+");
			return parts[parts.length - 1];
		})).collect(Collectors.toList());
		sortedList.forEach(System.out::println);
	}
}
