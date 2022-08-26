package com.deepak_hcl.stream.reverse_parallel_stream;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseParallelStreamTestDrive {

	public static void main(String[] args) {
		
		/* 1. We need to print it in reverse
		 * 2. We can traverse in reverse order in LinkedList
		 * 3. For converting it to LL we need to go generic way i.e. toCollection(LinkedList::new)
		 *    because there's no specific method for LL
		 * 4. Once we got the LL, for traversing in reverse order we need descending Iterator
		 * */
		
		List<Integer> myList = Arrays.asList(11, 22, 33, 44);
		myList.parallelStream()
			  .collect(Collectors.toCollection(LinkedList::new))
			  .descendingIterator()
			  .forEachRemaining(System.out::println);
	}
}