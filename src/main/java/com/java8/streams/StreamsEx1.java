package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsEx1 {

	public static void main(String[] args) {
		
		/*
		 * //Counting Empty String List<String>
		 * strList=Arrays.asList("ash","","ram","Ramesh"); long count
		 * =strList.stream().filter(x->x.isEmpty()).count(); System.out.println(count);
		 */
		
		//Create a List of the square of all distinct numbers
		List<Integer> listNumber=Arrays.asList(3,9,12,6,10,20);
		List<Integer> distance= listNumber.stream().map(x->x*x).distinct().collect(Collectors.toList());
		System.out.println(distance);
	}
}
