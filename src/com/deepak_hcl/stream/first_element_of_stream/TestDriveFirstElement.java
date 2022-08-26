package com.deepak_hcl.stream.first_element_of_stream;

import java.util.Arrays;
import java.util.List;

public class TestDriveFirstElement {

	public static void main(String[] args) {
		
		List<String> myList = Arrays.asList("Geek_First",
											"Geek_2",
											"Geek_3",
											"Geek_4",
											"Geek_Last");
		
		String firstStr = myList.stream()
								.reduce((first, second) -> first)
								.orElse(null);
		System.out.println("First element by reduce(): " + firstStr);
		
		String str1 = myList.stream()
							.findFirst()
							.orElse(null);
		System.out.println("First element by findFirst(): " + str1);
	}
}