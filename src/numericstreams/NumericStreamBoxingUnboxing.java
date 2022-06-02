package numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamBoxingUnboxing {

	public static List<Integer> boxing() {
		
		return IntStream.rangeClosed(1, 10)
				//primitives int
		          .boxed()
		        //Wrapper Integer
		          .collect(Collectors.toList());
	}
	
	public static int unboxing(List<Integer>li) {
		
	return	li.stream()
				.mapToInt(Integer::intValue).sum();
		
	}
	
	public static void main(String[] args) {
		
			List<Integer>boxing=boxing();
              System.out.println(boxing);
              
              System.out.println(unboxing(boxing));
	}

}
