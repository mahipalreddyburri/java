package streams.terminal.operations;

import java.util.List;
import java.util.stream.Collectors;

import com.consumer.Student;
import com.consumer.StudentDatabase;

public class SummingInt_AveragingInt {

	static List<Student>listStudents=StudentDatabase.getAllStudents();
	
	public static int summingInt() {
	  return listStudents.stream()
			  .filter((stu)->stu.getGender().equalsIgnoreCase("male"))
			  .collect(Collectors.summingInt(Student::getTextbooks));
	}
	
	public static double averagingInt() {
		return listStudents.stream()
				.filter((stu)->stu.getGender().equals("male"))
				.collect(Collectors.averagingInt(Student::getTextbooks));
	}
	
	public static void main(String[] args) {
		System.out.println("Total no of books held by male:"+summingInt());
		System.out.println("Average no of books by held by male:"+averagingInt());
	}

}
