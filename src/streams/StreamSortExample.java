package streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.consumer.Student;
import com.consumer.StudentDatabase;

public class StreamSortExample {

	static List<Student>listStu= StudentDatabase.getAllStudents();
	public static List<Student> getNamesInSort(){
		
	return	listStu.stream()
		.sorted(Comparator.comparing(Student::getName))
		.collect(Collectors.toList());
	}
	
	public static List<Student> getGpaInOrder(){
		
		return listStu.stream()
				.sorted(Comparator.comparing(Student::getGpa))
				.collect(Collectors.toList());
	}
	
	public static List<Student> getGpaInOrderByDesc(){
		return listStu.stream()
				.sorted(Comparator.comparing(Student::getGpa).reversed())
				.collect(Collectors.toList());
	}
	public static void main(String[] args) {
		System.out.println("names in order");
		getNamesInSort().forEach(System.out::println);
		
		System.out.println("gpa in order");
		getGpaInOrder().forEach(System.out::println);
		
		System.out.println("gpa in order by Desc");
		getGpaInOrderByDesc().forEach(System.out::println);
	}

}
