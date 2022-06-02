package numericstreams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregateExample {

	public static void main(String[] args) {

	OptionalInt op=	IntStream.rangeClosed(1, 20).max();
	if(op.isPresent())
	 System.out.println("max value is:"+op.getAsInt());
	
	OptionalLong op1=  LongStream.rangeClosed(0, 0).min();
	if(op1.isPresent())
	  System.out.println("min value is:"+op1.getAsLong());
	
	OptionalDouble	op3=IntStream.rangeClosed(0, 30).average();
	if(op3.isPresent())
	  System.out.println("average:"+op3.getAsDouble());
}
	
}

