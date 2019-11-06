package com.java.restService;

import org.springframework.web.client.RestTemplate;

public class GetEmployees {

	static final String URL_EMPLOYEES = "https://samples.openweathermap.org/data/2.5/forecast/hourly?zip=94040&appid=b6907d289e10d714a6e88b30761fae22";

	public static void main(String[] args) {

		RestTemplate restTemplate = new RestTemplate();

		Employee[] empList = restTemplate.getForObject(URL_EMPLOYEES, Employee[].class);

		if (empList != null) {
			for (Employee e : empList) {
				System.out.println("Employee: " + e.getEmpNo() + "-" + e.getEmpName());
			}
		}

	}

}
