import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import com.consumer.Student;
import com.consumer.StudentDatabase;

public class BiFunctionExample {

	static BiFunction<List<Student>, Predicate<Student>, Map<String,Double>>biFunction=((students,studentPredicate) -> {
		
		Map<String,Double>studentMap=new HashMap<>();
		
		students.forEach((student)->{
			if(studentPredicate.test(student)) {
				studentMap.put(student.getName(), student.getGpa());
			}
			
		});
		return studentMap;
	});
	public static void main(String[] args) {
		
		  // Predicate<Student>p1=(student)->student.getGpa()>=3;
          // System.out.println(biFunction.apply(StudentDatabase.getAllStudents(),p1 ));
		System.out.println(biFunction.apply(StudentDatabase.getAllStudents(),PredicateStudentEx.p2));
	}

}
