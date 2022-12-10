package com.java8.streams;

import java.util.Arrays;
import java.util.List;

public class StreamsEx1 {
	public static void main(String[] args) {

		/*
		 * // find out all the even numbers exist in the list using Stream functions
		 * List<Integer> myList = Arrays.asList(10, 15, 21, 17, 99, 19, 23);
		 * myList.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
		 */

		// find out all the numbers starting with 1 using Stream functions

		List<Integer> myList1 = Arrays.asList(9, 12, 67, 23, 45, 66, 91, 18);
		myList1.stream().map(s -> s + "").filter(s -> s.startsWith("1")).forEach(System.out::println);

	}

}
