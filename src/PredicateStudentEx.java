import java.util.List;
import java.util.function.Predicate;

import com.consumer.Student;
import com.consumer.StudentDatabase;

public class PredicateStudentEx {

	static Predicate<Student> p1 = (student) -> student.getGradelevel() >= 3;
	static Predicate<Student> p2 = (student) -> student.getGpa() > 8;
	static List<Student> stuList = StudentDatabase.getAllStudents();

	public static void getStudentByGrade() {
		stuList.forEach((student) -> {

			if (p1.test(student)) {
				System.out.println(student.getName() + " grade is:" + student.getGradelevel());
			}

		});
	}

	private static void getStudentByGpa() {
		stuList.forEach((student) -> {
			if (p2.test(student)) {
				System.out.println(student.getName() + " gpa is:" + student.getGpa());
			}
		});
	}

	private static void getStudentByGradeGpa() {
		stuList.forEach((student) -> {
			if (p1.and(p2).negate().test(student))
				System.out.println(
						student.getName() + " Grade " + student.getGradelevel() + " and Gpa " + student.getGpa());
		});
	}

	public static void main(String[] args) {

		getStudentByGrade();
		System.out.println("**********");
		getStudentByGpa();
		System.out.println("**********");
		getStudentByGradeGpa();

	}
}
