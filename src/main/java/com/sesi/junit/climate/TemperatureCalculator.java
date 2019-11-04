package com.sesi.junit.climate;

public class TemperatureCalculator {
	public float toFahrenheit(float degree) {
		System.out.println("degree:" + degree);
		float out = (degree * 9 / 5) + 32;
		System.out.println("out:" + out);
		return out;
	}

	public float toDegree(float fahrenheit) {
		System.out.println("fahrenheit:" + fahrenheit);
		float out = (fahrenheit - 32) * (float) (5.0 / 9.0);
		System.out.println("out:" + out);
		return out;
	}
}
