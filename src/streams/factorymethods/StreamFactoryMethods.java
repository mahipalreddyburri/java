package streams.factorymethods;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamFactoryMethods {

	public static void main(String[] args) {

	   Stream<Integer>streamIntegers=Stream.of(2,3,4,5,6,7);
	   streamIntegers.forEach(System.out::println);
	   
	   Stream<String>streamString=Stream.of("java","python","springboot","microservices");
	   streamString.forEach(System.out::println);
	
	   Stream.iterate(1, a->a+2)
	   		 .limit(10)
	         .forEach(System.out::println);
	 
	   Supplier<Integer> supplier=new Random()::nextInt;
	   Stream<Integer>s2=Stream.generate(supplier).limit(5);
	   s2.forEach(System.out::println);
	   
		/*
		 * Stream.generate(supplier) .limit(5) .forEach(System.out::println);
		 */
	}

}
