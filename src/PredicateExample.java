import java.util.function.Predicate;

public class PredicateExample {

	static Predicate<Integer>p1= (a) -> a%2==0;
	static Predicate<Integer>p2= (a) -> a%5==0;
	
	static void predicateAnd() {
		System.out.println("Predicate number is divisible by 2 and 5:"+p1.and(p2).test(10));
	}
	
	static void predicateOr() {
		System.out.println("Predicate Or result:.."+p1.or(p2).test(11));
	}
	
	static void negate() {
		System.out.println("Predicate Negate result is:"+p1.negate().test(11));
		System.out.println("Predicate Negate result is:.."+p1.or(p2).negate().test(11));
	}
	public static void main(String[] args) {
		
		/*
		 * Predicate<Integer>p1= (a) -> { if(a%2==0) return true; else return false; };
		 
		 Predicate<Integer>p1= (a) -> {return a%2==0;}; 
		 System.out.println(p1.test(6));*/
			
		predicateAnd();
		predicateOr();
		negate();
	}

}
