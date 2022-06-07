package optional;

import java.util.Optional;

public class OptionalOfOfNullableAndEmpty {

	public static Optional<String> ofNullable() {

		Optional<String> val = Optional.ofNullable("hello");    //hello
		//Optional<String> val = Optional.ofNullable(null);     //
		return val;
	}
	
	public static Optional<String> of(){
	// Optional<String>of=Optional.of("Hello");
	 Optional<String>of=Optional.of(null);
	 return of;
	}
	
	public static Optional<String> empty(){
	 Optional<String>empty=	Optional.empty();
	 return empty;
	}
	public static void main(String[] args) {

	Optional<String>ofNullable=ofNullable();
	System.out.println("ofNullable "+ofNullable); //if we pass null then  returns Optional.empty
	System.out.println("ofNullable "+ofNullable.get()); //if we pass value then returns that value(hello)
	
	//Optional<String>of=of();
	//System.out.println("of() "+of); //if we pass null then  returns NullPointerException
	//System.out.println("of() "+of.get()); //if we pass value then returns that value(hello)
	
	Optional<String>empty=empty();
	System.out.println("empty() "+empty); //returns Optional.empty
	 
	}

}
