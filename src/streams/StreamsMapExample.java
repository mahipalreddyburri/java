package streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.consumer.Student;
import com.consumer.StudentDatabase;

public class StreamsMapExample {

	public static List<String> getStudentNames() {
	List<String>stuList=StudentDatabase.getAllStudents().stream()
			//student as input ->name as output
		.map(Student::getName)
		.collect(Collectors.toList());
	
	return stuList;
	}
	
	public static Set<String> getStudentNamesSet(){
	Set<String>stuSet=StudentDatabase.getAllStudents().stream()
		.map(Student::getName)//Stream<String>
		.map(String::toUpperCase)//Stream<String>--uppercase operation on each input
		.collect(Collectors.toSet());//List<String>
	return stuSet;
	}
	public static void main(String[] args) {
		
		System.out.println(getStudentNames());
		System.out.println(getStudentNamesSet());
	}

}
