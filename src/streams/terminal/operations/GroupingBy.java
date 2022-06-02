package streams.terminal.operations;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.consumer.Student;
import com.consumer.StudentDatabase;

public class GroupingBy {

	static List<Student>listStudents=StudentDatabase.getAllStudents();
	
	public static void groupingBy() {
		Map<String, List<Student>>studentMap=listStudents.stream()
													.collect(Collectors.groupingBy(Student::getGender));
	
		System.out.println(studentMap);
		System.out.println("  ");
		
	}
	
	public static void groupingBy2() {
		System.out.println(listStudents.stream().collect(Collectors.groupingBy((stu)->stu.getGpa()>=8.5?"outstanding":"average")));
	}
	
	public static void groupingBy_TwopPrams() {
	Map<Integer,Map<Boolean,List<Student>>>	studentmap=listStudents.stream()
		.collect(Collectors.groupingBy(Student::getGradelevel,
				                       Collectors.groupingBy(stu->stu.getGpa()>=8.3)));
		System.out.println(studentmap);
	}
	
	public static void groupingBy_TwoParam2() {
	Map<String,Integer>map=listStudents.stream()
		.collect(Collectors.groupingBy(Student::getName, 
				  Collectors.summingInt(Student::getTextbooks)));
		System.out.println(map);
	}
	
	public static void groupingBy_ThreeParams() {
	LinkedHashMap<String,Set<Student>>studlinkedHashMap=listStudents.stream()
													.collect(Collectors.groupingBy(Student::getName, LinkedHashMap::new, Collectors.toSet()));
	   System.out.print(studlinkedHashMap);
	}
	
	public static void calculateMaxGpa() {
		Map<Integer, Optional<Student>> maxGpa = listStudents.stream().collect(
				Collectors.groupingBy(Student::getGradelevel, Collectors.maxBy(Comparator.comparing(Student::getGpa))));
		System.out.println(maxGpa);
	}

	public static void calculateMaxGpa2() {
		Map<Integer, Student> maxGpa2 = listStudents.stream().collect(
				Collectors.groupingBy(Student::getGradelevel,Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student::getGpa))
						,Optional::get)));
		System.out.println(maxGpa2);
	}
	
	public static void calculateMinGpa() {
		Map<Integer, Optional<Student>>minGpa=	listStudents.stream().collect(
				Collectors.groupingBy(Student::getGradelevel,Collectors.minBy(Comparator.comparing(Student::getGpa))));
		
		System.out.println(minGpa);
	}
	public static void main(String[] args) {
		//groupingBy();
		//groupingBy2();
		//groupingBy_TwopPrams();
		//groupingBy_TwoParam2();
		
		//groupingBy_ThreeParams();
		calculateMaxGpa();
		calculateMaxGpa2();
		calculateMinGpa();
	}

}
