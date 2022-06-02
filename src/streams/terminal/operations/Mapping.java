package streams.terminal.operations;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.consumer.Student;
import com.consumer.StudentDatabase;
public class Mapping {

	static List<Student>listStu=StudentDatabase.getAllStudents();
	public static List<String> mapping(){
		return listStu
				.stream()
				.collect(Collectors.mapping(Student::getName,Collectors.toList()));
	}
	public static Set<String> mapping2(){
		return  listStu
				.stream()
				.collect(Collectors.mapping(Student::getName, Collectors.toSet()));
		 
	}
	
	//extra map
	public static List<String> getStudentNames() {
	 return	listStu.stream()
			 	.map(Student::getName)  
			 	.collect(Collectors.toList());
	}
	
	public static void main(String[] args) {

		System.out.println("using mapping() returns list"+mapping());
		System.out.println("using mapping2() returns set "+ mapping2());
		System.out.println("getStudentNames() "+getStudentNames());
	}

}
