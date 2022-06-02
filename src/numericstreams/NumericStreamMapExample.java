package numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamMapExample {

	//converts IntStream to List<Integer>
	public static List<Integer> mapToObj() {
		
		return IntStream.rangeClosed(1, 20)
		        .mapToObj((i)->{
		        	return new Integer(i);
		        })
		        .collect(Collectors.toList());
	}
	
	public static long mapToLong() {
	 return IntStream.rangeClosed(1, 20) //intStream
		.mapToLong((i)->i)  //convert intStream to LongStream
		.sum();
	}
	
	public static double mapToDouble() {
	 return	IntStream.rangeClosed(1, 20) 
		.mapToDouble((i)->i)//convert intstream to DoubleStream
		.sum();
	}
	
	public static void main(String[] args) {
		System.out.println("mapToObj() is "+mapToObj());
		System.out.println("mapToLong() is "+mapToLong());
		System.out.println("mapToDouble() is "+mapToDouble());
	}

}
