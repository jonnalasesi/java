package com.sesi.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamFilterCollect {

	public static void main(String[] args) {

		List<Person> persons = Arrays.asList(new Person("sesi", 30), new Person("jack", 20),
				new Person("lawrence", 40));

		Person listPersons = getStudentByName(persons, "jack");
		System.out.println(listPersons);

		// using Java 7
		List<String> lines = Arrays.asList("spring", "node", "sesi");
		List<String> result = getFilterOutput(lines, "sesi");
		for (String temp : result) {
			System.out.println(temp);
		}
		result =

				getFilterOutput(lines, "node");

	}

	private static Person getStudentByName(List<Person> persons, String name) {
		Person result = null;
		Person result1 = persons.stream()
				.filter(x -> name.equals(x.getName()))
				.findAny()
				.orElse(null);
		 result1 = persons.stream()
				.filter(x -> {
					if(x.getAge()==20) {
						return true;
					}
					return false;
				}).findAny()
				.orElse(null);
		 List<String> collect = persons.stream()
				 .map(Person::getName)
				 .collect(Collectors.toList());
		 collect.forEach(System.out::println);
		System.out.println(result1);

		for (Person temp : persons) {
			if (name.equals(temp.getName())) {
				result = temp;
			}
		}
		return result;
		
	}

	// filter String in list using Java 7
	private static List<String> getFilterOutput(List<String> lines, String filter) {
		List<String> result = new ArrayList<>();
		if (filter == "sesi") {
			for (String line : lines) {
				if (!filter.equals(line)) {
					result.add(line);
				}
			}
		} else if (filter == "node") {
			// java streams
			result = lines.stream().filter(line -> !filter.equals(line)).collect(Collectors.toList());
			result.forEach(System.out::println);
		}
		return result;
	}

}
