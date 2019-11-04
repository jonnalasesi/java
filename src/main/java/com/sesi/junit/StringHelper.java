package com.sesi.junit;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class StringHelper {

	private static final Scanner scanner = new Scanner(System.in);

	public String evenOrOdd() {
		String outPut = null;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int N = Integer.parseInt(br.readLine().trim());
			if (N < 1 || N > 100)
				throw new Exception();
			if ((N & 1) == 1) {
				outPut = "Weird";
			} else {
				if (N >= 2 && N <= 5) {
					outPut = "Not Weird";
				} else if (N >= 6 && N <= 20) {
					outPut = "Weird";
				} else {
					outPut = "Not Weird";
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("" + outPut);
		return outPut;
	}

	public void sort_performance() {
		try {
		Integer array[] = { 12, 232, 4 };
		for (int i = 1; i <= 1000000; i++) {
			array[0] = i;
			Arrays.sort(array);
			System.out.println("" + Integer.valueOf(StringUtils.join(array)));
		}
		}catch(NumberFormatException e) {
			System.out.println(e);
		}
	}

	public String truncateAInFirst2Positions(String str) {

		System.out.println("" + str);
		if (str.length() <= 2)
			return str.replaceAll("A", "");

		String first2Chars = str.substring(0, 2);
		String stringMinusFirst2Chars = str.substring(2);

		return first2Chars.replaceAll("A", "") + stringMinusFirst2Chars;
	}

	public boolean areFirstAndLastTwoCharactersTheSame(String str) {
		System.out.println("areFirstAndLastTwoCharactersTheSame:" + str);

		if (str.length() <= 1)
			return false;
		if (str.length() == 2)
			return true;

		String first2Chars = str.substring(0, 2);

		String last2Chars = str.substring(str.length() - 2);
		System.out.println("first2Chars:" + first2Chars + "last2Chars:" + last2Chars);
		return first2Chars.equals(last2Chars);
	}

	public static void main(String[] args) {
		StringHelper h = new StringHelper();
		h.sort_performance();
	}

}
