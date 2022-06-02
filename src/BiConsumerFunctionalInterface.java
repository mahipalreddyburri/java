import java.util.List;
import java.util.function.BiConsumer;

import com.consumer.Student;
import com.consumer.StudentDatabase;

public class BiConsumerFunctionalInterface {

	public static void getNameAndActivity() {
	
	BiConsumer<String, List<String>>biconsumer=(name,activities) ->System.out.println(name+ ","+activities);
		
	List<Student>stuList=StudentDatabase.getAllStudents();
	
	stuList.forEach(student ->biconsumer.accept(student.getName(),student.getActivity()));
	}
	
	public static void main(String[] args) {
		
		BiConsumer<String,String> add=(a,b) -> {
			System.out.println("Addition  is "+(a+b));
		};

		add.accept("java8", "springboot");
		
		BiConsumer<Integer,Integer>multiply=(a,b) -> {
			System.out.print("mutiplication of "+a+" & "+b+" is "+a*b);
		};
		
		BiConsumer<Integer,Integer>division=(a,b) -> {
			System.out.println("division of"+a+" & "+b+" is "+a/b);
		};
		
		multiply.andThen(division).accept(4, 2);
		getNameAndActivity();
	}
}
