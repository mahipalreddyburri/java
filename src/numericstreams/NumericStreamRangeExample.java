package numericstreams;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamRangeExample {

	public static void main(String[] args) {

		IntStream intStream= IntStream.range(1, 50);
		System.out.println("IntStream.range(1,50) count:"+intStream.count());
		IntStream.range(1, 50).forEach((val)->System.out.print(val+","));
		
		System.out.println(" ");
		System.out.println("IntStream.rangeClosed(1,50)count:"+IntStream.rangeClosed(1, 50).count());
		IntStream.rangeClosed(1, 50).forEach((val)->System.out.print(val+":"));
		
		System.out.println(" ");
		System.out.println("LongStream.range(1, 20) count:"+LongStream.range(1, 20).count());
		LongStream.range(1, 20).forEach((val)->System.out.print(val+","));
		
		System.out.println(" ");
		System.out.println("LongStream.rangeClosed(1, 20) count:"+LongStream.rangeClosed(1, 20).count());
		LongStream.rangeClosed(1, 20).forEach((val)->System.out.print(val+","));
		
		System.out.println(" ");
		IntStream.range(1, 20).asDoubleStream().forEach((val)->System.out.print(val+","));
		
		System.out.println(" ");
		IntStream.rangeClosed(1, 20).asDoubleStream().forEach((val)->System.out.print(val+","));
	}

}
