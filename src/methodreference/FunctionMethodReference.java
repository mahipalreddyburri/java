package methodreference;

import java.util.function.Function;

public class FunctionMethodReference {

	public static void main(String[] args) {
		
          Function<String, String>f1=(s)->s.toUpperCase();
          System.out.println(f1.apply("mahipal reddy"));
          
          Function<String,String>f2=String::toUpperCase;
          System.out.println(f2.apply("java8"));
	}

}
