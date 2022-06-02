package streams;

import java.util.List;

import com.consumer.Student;
import com.consumer.StudentDatabase;

public class StreamReduceMapExample {
	static List<Student>listStu= StudentDatabase.getAllStudents();
	
	//Total No of Books of All Students
	public static int getTotalNoOfBooks() {
		return listStu.stream()
				.map(Student::getTextbooks)
			//	.reduce(0, (a, b) -> a + b);
		      .reduce(0, Integer::sum);
	}

	//Total no of books of whose gpa morethan 8 of gender female
	public static int getTotalNoOfBooksByUsinggender() {
		int no=listStu.stream()
				.filter((student)->student.getGender().equalsIgnoreCase("female"))
				.map(Student::getTextbooks)
				.reduce(0, (a,b)->a+b);
		
		return no;
	}
	
	
	public static void main(String[] args) {

		System.out.println(getTotalNoOfBooks());
		System.out.println(getTotalNoOfBooksByUsinggender());
	}

}
