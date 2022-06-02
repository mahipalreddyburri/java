import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

import com.consumer.Student;
import com.consumer.StudentDatabase;

public class BiPrediccateExample {

	/*
	 * Predicate<Student>p1= (student)->student.getGpa()>=8.0; Predicate<Student>p2=
	 * (student)->student.getGradelevel()>=3;
	 */
	
	BiPredicate<Integer, Double>biPredicate=(grade,gpa)->grade>=3 && gpa>8.0;
	
	BiConsumer<String,List<String>>biConsumer=(name,activity)->System.out.println("name:"+name+" activity:"+activity);
	
	Consumer<Student>consumer=(student)->{
		if(biPredicate.test(student.getGradelevel(), student.getGpa())) {
		
		    biConsumer.accept(student.getName(), student.getActivity());
		}
	};
	
	public void printStudentsByGpaAndGrade(List<Student> listStu) {
		listStu.forEach(consumer);
	}
	
	public static void main(String[] args) {
		List<Student>listStudents=StudentDatabase.getAllStudents();
       new BiPrediccateExample().printStudentsByGpaAndGrade(listStudents);
	}
	
	

}
