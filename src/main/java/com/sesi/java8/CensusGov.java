package com.sesi.java8;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class CensusGov {

	@Autowired
	Developer developer;
	
	public static void main(String args[]) {
		final String uri = "https://api.census.gov/data/2018/acs/acs1?get=NAME,group(B01001)&for=us:1";

		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(uri, String.class);
		// System.out.println(result);
		ObjectMapper objectMapper = new ObjectMapper();
		User[] users = null;
		try {
			users = objectMapper.readValue(result, User[].class);

		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
