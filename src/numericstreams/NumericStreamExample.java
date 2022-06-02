package numericstreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamExample {

	public static int sumOfNNumbers(List<Integer>listIntegers){
		
		return listIntegers.stream()
		     .reduce(0, (x,y)->x+y);  //unboxing primitives to Integers
		
	}
	
	public static int sumOfNNumbers2(List<Integer>listIntegers){
		return IntStream.rangeClosed(1, 5).sum();
	}
	
	public static void main(String[] args) {

		List<Integer>listIntegers=Arrays.asList(1,2,3,4,5);
		System.out.println("sum of N numbers:"+sumOfNNumbers(listIntegers));
		
		System.out.println("SUm of N numers Using IntStream:"+sumOfNNumbers2(listIntegers));
	}

}
