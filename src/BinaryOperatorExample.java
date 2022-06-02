import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

	public static void main(String[] args) {
		BinaryOperator<Integer>binaryop=(a,b)->{
			   
			return a*b;
		};
     System.out.println(binaryop.apply(2, 3));
     
    Comparator<Integer>comparator=(a,b)->a.compareTo(b);
    
    BinaryOperator<Integer> maxBy=BinaryOperator.maxBy(comparator);
    BinaryOperator<Integer>minBy=BinaryOperator.minBy(comparator);
    
    System.out.println("Result maxBy is:"+maxBy.apply(4, 10));
    System.out.println("Result minBy is:"+minBy.apply(4, 10));
	}

}
