package streams.terminal.operations;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.consumer.Student;
import com.consumer.StudentDatabase;

public class MaxByMinBy {

	static List<Student> listStudents=StudentDatabase.getAllStudents();
	public static Optional<Student> maxBy() {
		return 	listStudents.stream()
				.collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
	}
	
	public static Optional<Student>  minBy(){
	 return listStudents.stream()
			 	.collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
	}
	
	
	public static void main(String[] args) {
		Optional<Student>maxByOptinal=maxBy();
		if(maxByOptinal.isPresent())
		System.out.println("max gpa using maxBy "+maxBy().get());
		
		
		Optional<Student>minBy=minBy();
		if(minBy.isPresent())
			System.out.println("min gpa using minBy "+minBy().get());
	}

}
