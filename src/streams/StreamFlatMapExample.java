package streams;

import java.util.List;
import java.util.stream.Collectors;

import com.consumer.StudentDatabase;
import com.consumer.Student;

public class StreamFlatMapExample {

	static List<Student>listStud=StudentDatabase.getAllStudents();
	public static List<String> getActivities(){
		
	List<String>activitiesList=	listStud.stream()//Stream<Student>
		.map(Student::getActivity)//Stream<List<String>>
		.flatMap(List::stream)//Stream<String>
		.distinct()//Stream<String>
		.collect(Collectors.toList());
	
	return activitiesList;
	}
	
	public static long noOfUniqueActivities() {
	  long count=listStud.stream()
		.map(Student::getActivity)
		.flatMap(List::stream)
		.distinct()
		.count();
	return count;
	}
	
	public static List<String> sortactivities(){
	List<String>sortactivities=listStud.stream()
		.map(Student::getActivity)
		.flatMap(List::stream)
		.distinct()
		.sorted()
		.collect(Collectors.toList());
		
	return sortactivities;
	}
	public static void main(String[] args) {
		
      System.out.println("distinct "+getActivities());
      System.out.println("count "+noOfUniqueActivities());
      System.out.println("sorted "+sortactivities());
	}

}
