package com.deepak_hcl.stream.last_element_of_stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestDriveLastElement {

	public static void main(String[] args) {
		
		List<String> myList = Arrays.asList("Geek_First",
				"Geek_2",
				"Geek_3",
				"Geek_4",
				"Geek_Last");

		String lastStr = myList.stream()
							   .reduce((first, last) -> last)
							   .orElse(null);
		System.out.println("Last element by reduce(): " + lastStr);
		
		String lastString = myList.stream()
								  .skip(myList.size() - 1)
								  .findFirst()
								  .orElse(null);
		System.out.println("Last element by skip(): " + lastString);
		
		String lastWord = myList.stream()
								.sorted(Collections.reverseOrder())
								.findFirst()
								.orElse(null);
		System.out.println("Last element by : first element of reversed stream: " + lastWord);
	}
}