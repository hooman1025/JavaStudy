package com.test.exam03;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExam {

	List<String> list = Arrays.asList("abba", "chemical", "brand");
	
	
	
	Stream<String> listStream = list.stream(); 
	
	
	
}
