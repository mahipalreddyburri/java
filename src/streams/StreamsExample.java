package streams;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.consumer.Student;
import com.consumer.StudentDatabase;

public class StreamsExample {

	static List<Student> listStu=StudentDatabase.getAllStudents();
	static Predicate<Student>p1=(student)->student.getGpa()>8.0;
	public static void main(String[] args) {
		
		//get Student name and activities
		Map<String, List<String>> stuMap = listStu.stream()
				.collect(Collectors.toMap(Student::getName, Student::getActivity));

		System.out.println(stuMap);
		
		//get Student name and activities where grade>=3 and gpa>=8
		Map<String, List<String>> stuMap2 = listStu.stream()
				                                    .filter((student) -> student.getGradelevel() >= 3)
				                                    .filter(p1)
				                                    .collect(Collectors.toMap(Student::getName, Student::getActivity));
	
		System.out.println("************");
		System.out.println(stuMap2);
	}

}
