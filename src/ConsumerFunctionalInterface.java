import java.util.List;
import java.util.function.Consumer;

import com.consumer.Student;
import com.consumer.StudentDatabase;

public class ConsumerFunctionalInterface{
	static Consumer<Student> c2 = (student) -> System.out.println(student);
	static Consumer<Student>c3=(student) -> System.out.print(student.getName());
	static Consumer<Student>c4=(student) -> System.out.println(student.getActivity());
	static Consumer<Student> c5=(student) -> System.out.println(student.getGender());
	static List<Student> studentsList = StudentDatabase.getAllStudents();
	
	public static void printStudents() {
		studentsList.forEach(c2);
	}

	public static void prinatNameAndActivities() {
		studentsList.forEach(c3.andThen(c4));//consumer chaining
	}

	public static void printNameAndActivitiesWithCondition() {
		
		studentsList.forEach(student -> {
			if(student.getGradelevel()>2 && student.getGpa()>=8.5) {
				c3.andThen(c4).andThen(c5).accept(student);
			}
		});
		
	}
	public static void main(String[] args) {

		Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());

		c1.accept("hi");

		printStudents();
		prinatNameAndActivities();
		System.out.println("---------------------------");
		printNameAndActivitiesWithCondition();
	}
}
