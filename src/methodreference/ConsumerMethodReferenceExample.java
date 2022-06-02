package methodreference;

import java.util.function.Consumer;

import com.consumer.Student;
import com.consumer.StudentDatabase;

public class ConsumerMethodReferenceExample {

	public static void main(String[] args) {
		
	    Consumer<Student>c=(student)->System.out.println(student);
		StudentDatabase.getAllStudents().forEach(c);
		
		System.out.println("--------------");
		
		Consumer<Student>c1=System.out::println;
		StudentDatabase.getAllStudents().forEach(c1);

		System.out.println("*************");
		
		Consumer<Student>c2=Student::listOfActivities;
		StudentDatabase.getAllStudents().forEach(c2);
	}

}
