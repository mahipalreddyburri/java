package optional;

import java.util.Optional;

public class OptionalPresent {

	public static Optional<String> optional(){
	Optional<String>s=	Optional.ofNullable("hi");
	return s;
	}
	
	public static void main(String[] args) {
		Optional<String>s=optional();
		if(s.isPresent())
			System.out.println(s.get());
		
		s.ifPresent(s1->System.out.println(s.get()));
	}

}
