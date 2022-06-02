package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.consumer.Student;
import com.consumer.StudentDatabase;

public class StreamsReduceExample {
	
	public static int multiply(List<Integer> li){
		
		return li.stream()
		.reduce(1, (a,b)->a*b);
		//a=1 b=1  result=1
		//a=result(1) b=3   result=3
		//a=result(3) b=5   result=15
		//a=result(15)b=7  result=105
	}
	public static Optional<Integer> multiplyWithoutIdentity(List<Integer> li){
		
		return li.stream()
		.reduce((a,b)->a*b);
	}
	
	public static Optional<Student> getHighestGpa(){
		
	return	StudentDatabase.getAllStudents().stream()
		.reduce((s1,s2)->(s1.getGpa()>s2.getGpa()?s1:s2));
				/*
				 * if(s1.getGpa()>s2.getGpa()) { return s1; }else { return s2; }
				 */
	}
	
	public static void main(String[] args) {

		List<Integer>list=	Arrays.asList(1,3,5,7);
		System.out.println(multiply(list));
		
		Optional<Integer>result=multiplyWithoutIdentity(list);
		System.out.println("isPresent "+result.isPresent());
		System.out.println("value "+result.get());
		
		List<Integer>emptyList=new ArrayList<Integer>();
		Optional<Integer>result1=multiplyWithoutIdentity(emptyList);
		if(result1.isPresent())
		System.out.println(result1.get());
		
		System.out.println("Highest Gpa using reduce");
	Optional<Student>optionaldata=getHighestGpa();
	if(optionaldata.isPresent()) {
		System.out.println(optionaldata.get());
	}
	}

}
