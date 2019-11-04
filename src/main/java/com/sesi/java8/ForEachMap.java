package com.sesi.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachMap {
	public static void main(String[] args) {

		// normal way to loop a map
		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);

		for (Map.Entry<String, Integer> entry : items.entrySet()) {
			System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
		}

		// using forEach+lambda expression
		Map<String, Integer> itemCount = new HashMap<>();
		itemCount.put("A", 10);
		itemCount.put("B", 20);
		itemCount.put("C", 30);
		itemCount.put("D", 40);
		itemCount.put("E", 50);
		itemCount.put("F", 60);

		itemCount.forEach((k, v) -> System.out.println("Item : " + k + " Count : " + v));

		itemCount.forEach((k, v) -> {
			System.out.println("Item : " + k + " Count : " + v);
			if ("E".equals(k)) {
				System.out.println("Hello E");
			}
		});

		List<String> listItems = new ArrayList<>();
		listItems.add("A");
		listItems.add("B");
		listItems.add("C");
		listItems.add("D");
		listItems.add("E");

		for (String item : listItems) {
			System.out.println(item);
		}

		//lambda
		listItems.forEach(item -> System.out.println(item));
		listItems.forEach(item -> {
			if ("C".equals(item)) {
				System.out.println(item);
			}
		});
		
		//stream and filter
		listItems.stream().filter(s -> s.contains("B")).forEach(System.out::println);
	}
	
	

}
