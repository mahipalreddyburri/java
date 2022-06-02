package streams.terminal.operations;

import java.util.List;
import java.util.stream.Collectors;

import com.consumer.Student;
import com.consumer.StudentDatabase;

public class Joining {

	 static List<Student>listStud=StudentDatabase.getAllStudents();
	
	//concat all student names
	public static String joining_1() {
	return	listStud.stream()
		.map((stu)->stu.getName())
		.collect(Collectors.joining());
		
	}
	
	public static String joining_2() {
		return listStud.stream()
				.map(Student::getName)
				.collect(Collectors.joining("-"));
	}
	
	public static String joining_3() {
		return listStud.stream()
				.map(Student::getName)
				.collect(Collectors.joining("-", "(", ")"));
	}
	public static void main(String[] args) {

		System.out.println("joining_1() "+joining_1());
		System.out.println("joining_2() "+joining_2());
		System.out.println("joining_3() "+joining_3());
	}

}
