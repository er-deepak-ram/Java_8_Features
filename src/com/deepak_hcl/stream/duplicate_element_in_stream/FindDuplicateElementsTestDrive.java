package com.deepak_hcl.stream.duplicate_element_in_stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateElementsTestDrive {

	public static void main(String[] args) {
		
		/* Input:  {5, 13, 4, 21, 13, 27, 2, 59, 59, 34}
		 * Output: [59, 13]
		 * Explanation: The only duplicate elements in the given collection are 59 and 13
		 * */
		List<Integer> myList = Arrays.asList(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);
		
		/* The frequency(Collection c, Object o) method, counts the frequency
		 * of the specified element in the given list.*/
		Set<Integer> mySet = myList.stream()
							  	   .filter(i -> Collections.frequency(myList, i) > 1)
							       .collect(Collectors.toSet());
		
		System.out.println(mySet);
	}
}