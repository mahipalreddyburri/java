package streams;

import java.util.List;
import java.util.stream.Collectors;

import com.consumer.Student;
import com.consumer.StudentDatabase;

public class StreamFilterExample {

	public static List<Student> getStudents(){
		
	return	StudentDatabase.getAllStudents().stream()
		.filter((student)->student.getGender().equalsIgnoreCase("female"))
		.filter((student)->student.getGpa()>8)
		.collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
       System.out.println("get students whose gpa>=8");
       getStudents().forEach(System.out::println);
	}

}
