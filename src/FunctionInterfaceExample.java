import java.util.function.Function;

public class FunctionInterfaceExample {

	static Function<String, String>function=(name)->name.toUpperCase();
	static Function<String,String>function1=(name)->name.toUpperCase().concat("default");
	
	public static void main(String[]args) {
		
		System.out.println(function.apply("java8"));
			
		System.out.println(function.andThen(function1).apply("java8"));
		
		System.out.println(function.compose(function1).apply("java8"));
		
	}
}
