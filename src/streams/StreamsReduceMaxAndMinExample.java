package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsReduceMaxAndMinExample {
	public static int getMaxElement(List<Integer> li) {

		int i = li.stream().reduce(0, (a, b) -> a > b ? a : b);
		return i;
	}

	public static Optional<Integer> getMaxElementByOptional(List<Integer> li) {

		return li.stream().reduce((a, b) -> a > b ? a : b);
	}

	//for min always,don't use identity initial value
	public  Optional<Integer> getMinElementByOptional(List<Integer>li){
		return	li.stream().reduce((a,b)->a<b?a:b);
	}
	
	
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(20, 30, 11, 50, 32, 06);
		System.out.println(getMaxElement(values));

		List<Integer> values2 = new ArrayList<>();
		System.out.println(getMaxElement(values2));

		Optional<Integer> maxByOptional = getMaxElementByOptional(values);
		if (maxByOptional.isPresent()) {
			System.out.println(" Max value is:" + maxByOptional.get());
		}

		Optional<Integer> minValueByOptional = new StreamsReduceMaxAndMinExample().getMinElementByOptional(values);
		if (minValueByOptional.isPresent()) {
			System.out.println("min value is:" + minValueByOptional.get());
		}else {
			System.out.println("min value Optional:"+minValueByOptional);
		}
	}

}
