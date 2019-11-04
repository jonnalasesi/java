package com.sesi.java8;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestSortingLambdaExpression {

	public static void main(String[] args) {

		List<Developer> listDevs = getDevelopers();

		System.out.println("Before Sort - Age");
		listDevs.forEach((developer) -> System.out.println(developer));

		// sort by age lambda
		listDevs.sort((Developer o1, Developer o2) -> o2.getAge() - o1.getAge());
		System.out.println("After Sort - Age");
		listDevs.forEach((developer) -> System.out.println(developer));

		/**
		 * sort by name
		 */
		System.out.println("Before Sort - Name");
		listDevs.forEach((developer) -> System.out.println(developer));

		// sort by Name
		listDevs.sort((Developer o1, Developer o2) -> o1.getName().compareTo(o2.getName()));

		System.out.println("After Sort - Name");
		listDevs.forEach((developer) -> System.out.println(developer));

		/**
		 * sort by salary
		 */
		System.out.println("Before Sort - Salary");
		listDevs.forEach((developer) -> System.out.println(developer));

		// sort by Salary
		listDevs.sort((Developer o1, Developer o2) -> o1.getSalary().compareTo(o2.getSalary()));

		System.out.println("After Sort - Salary");
		listDevs.forEach((developer) -> System.out.println(developer));

	}

	private static List<Developer> getDevelopers() {

		List<Developer> result = new ArrayList<Developer>();

		result.add(new Developer("mkyong", new BigDecimal("70000"), 33));
		result.add(new Developer("alvin", new BigDecimal("80000"), 20));
		result.add(new Developer("jason", new BigDecimal("100000"), 10));
		result.add(new Developer("iris", new BigDecimal("170000"), 55));

		return result;

	}

}