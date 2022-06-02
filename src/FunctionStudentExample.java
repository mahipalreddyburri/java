import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import com.consumer.Student;
import com.consumer.StudentDatabase;

public class FunctionStudentExample {

	static Function<List<Student>,Map<String,Double>>studentFunction=(students->{
		
		Map<String,Double>studentMap=new HashMap<>();
		
		students.forEach((student)->{
			if(PredicateStudentEx.p2.test(student))
			studentMap.put(student.getName(), student.getGpa());
			
		});
	
		return studentMap;
	});
	
	public static void main(String[] args) {
		
        System.out.println(studentFunction.apply(StudentDatabase.getAllStudents()));
	}

}
