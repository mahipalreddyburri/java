
public class FunctionExample1 {

	public static String performConcat(String str) {
		
		return FunctionInterfaceExample.function1.apply(str);
	}
	
	public static void main(String[] args) {
		
	  String s=performConcat("mahipal");
	  System.out.println("Result is "+s);
	}

}
