import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

	public static void main(String[] args) {
		
		UnaryOperator<String> u =(s)->s.concat("hi");
		System.out.println(u.apply("java8"));
	}
}
