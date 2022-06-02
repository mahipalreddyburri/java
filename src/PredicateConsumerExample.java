import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.consumer.Student;
import com.consumer.StudentDatabase;

public class PredicateConsumerExample {

	Predicate<Student>p1=(student)->student.getGradelevel()>=3;
	Predicate<Student>p2=(student)->student.getGpa()>=8.0;
	
	BiConsumer<String,List<String>> studentbiConsumer=(name,activities)->System.out.println("name:"+name+" activities:"+activities);
	
	Consumer<Student>studentConsumer = (student)->{
          if(p1.and(p2).test(student)) {
        	  studentbiConsumer.accept(student.getName(), student.getActivity());
          }
	};

	public void printByNameAndActivities(List<Student> listStu) {
		
		listStu.forEach(studentConsumer);
	}
	
	public static void main(String[] args) {
		
		List<Student>listStud=StudentDatabase.getAllStudents();

		new PredicateConsumerExample().printByNameAndActivities(listStud);
	}

}
