package streams;

import java.util.List;

import com.consumer.Student;
import com.consumer.StudentDatabase;

public class StreamsAllMatchAnyMatchNoneMatchExample {

	static List<Student> studentsList=StudentDatabase.getAllStudents();
	public static boolean allMatch() {
		return studentsList.stream()
				.allMatch((student)->student.getGpa()>=8.1);
	}
	public static boolean anyMatch() {
		return studentsList.stream()
				.anyMatch((student)->student.getGpa()>=8.5);
	}
	public static boolean noneMatch() {
		return studentsList.stream()
				.noneMatch((stu)->stu.getGpa()>=9);
	}
	public static void main(String[] args) {
		System.out.println(allMatch());
		System.out.println(anyMatch());
		System.out.println(noneMatch());
	}

}
