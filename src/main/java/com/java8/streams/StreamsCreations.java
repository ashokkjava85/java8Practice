package com.java8.streams;

import java.util.List;
import java.util.stream.Stream;

public class StreamsCreations {
	public static void main(String[] args) {

		// 1. Streams Creations Stream.of method

		Stream<Integer> streamsOfInteger = Stream.of(23, 14, 9, 81, 27);

		// 2 .using stream() & parallelStream() methods

		List<String> list2 = List.of("one", "two", "three", "Four", "Five", "Six");
		Stream<String> streamofStrings2 = list2.stream(); // Sequention Stream
		Stream<String> streamofParrllel2 = list2.parallelStream(); // Parllel Stream
		// 3.

		/*
		 * // find out all the even numbers exist in the list using Stream functions
		 * List<Integer> myList = Arrays.asList(10, 15, 21, 17, 99, 19, 23);
		 * myList.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
		 */
		/*
		 * // find out all the numbers starting with 1 using Stream functions
		 * 
		 * List<Integer> myList1 = Arrays.asList(9, 12, 67, 23, 45, 66, 91, 18);
		 * myList1.stream().map(s -> s + "").filter(s ->
		 * s.startsWith("1")).forEach(System.out::println);
		 */
	}

}
