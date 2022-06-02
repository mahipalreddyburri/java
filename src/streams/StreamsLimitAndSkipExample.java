package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitAndSkipExample {

	public static Optional<Integer> limit(List<Integer> li){
		
	return 	li.stream()
		.limit(3) //first 3 elements processed ie. 2,3,5
		.reduce((a,b)->a+b);
		
	}
	
	public static Optional<Integer> skip(List<Integer>li){
		Optional<Integer>skip=li.stream()
							.skip(3)// skips first 3 elements and process remaining
							.reduce((a,b)->a+b);
		return skip;
	}
	
	public static void main(String[] args) {
		List<Integer> values=Arrays.asList(2,3,5,7,4,8,9);
        Optional<Integer>limit=limit(values);
        if(limit.isPresent())
        System.out.println("Limit is "+limit.get());
        
        Optional<Integer>skip=skip(values);
        if(skip.isPresent())
        	System.out.println("skip value: "+skip.get());
	}

}
