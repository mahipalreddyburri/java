import java.util.function.Predicate;

import com.consumer.Student;
import com.consumer.StudentDatabase;

public class RefactorMethodReferenceExample {

	//static Predicate<Student>p1=(student)->student.getGpa()>=8;
	
	static Predicate<Student>p1=RefactorMethodReferenceExample::greaterThanGpaCondition;
	
	public static boolean greaterThanGpaCondition(Student s) {
		
		return  s.getGpa()>=8;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(p1.test(StudentDatabase.supplier.get()));
	
	}

}
