package com.sesi.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.sesi.junit.climate.TemperatureCalculator;

public class SpringHelperTest {
	StringHelper helper;
	TemperatureCalculator helper1;

	@Before
	public void before() {
		helper = new StringHelper();
		helper1 = new TemperatureCalculator();
	}

	@Test
	public void test() {
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
		assertEquals("#", helper.truncateAInFirst2Positions("AA#"));
		assertEquals(")", helper.truncateAInFirst2Positions("AA)"));
		assertEquals("ABCD", "ABCD");
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ernger"));
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ranger"));
	}

	@Test
	public void test1() {
		assertEquals("93.2", "93.2");
		assertEquals("jghghjg", 93.2f, helper1.toFahrenheit(34), 0);
		assertEquals("jgfuvy", 25.555557f, helper1.toDegree(78), 0);
	}

}


