package optional;

import java.util.Optional;

import com.consumer.Student;
import com.consumer.StudentDatabase;

public class OrElseOrElseGetOrElseThrow {

	public static String orElse() {
		//Optional<Student>orElse=Optional.ofNullable(new StudentDatabase().supplier.get());
		Optional<Student>orElse=Optional.ofNullable(null);
		String str=	orElse.map(Student::getName).orElse("Default");
		
		return str;
	}
	
	public static String orElseGet() {
		//Optional<Student>orElseGet=Optional.ofNullable(new StudentDatabase().supplier.get());
		Optional<Student>orElseGet=Optional.ofNullable(null);
		String str=orElseGet.map(Student::getName).orElseGet(()->"Default");
		return str;
	}
	
	public static String orElseThrow() {
	  //Optional<Student>orElseThrow=Optional.ofNullable(new StudentDatabase().supplier.get());
		Optional<Student>orElseThrow=Optional.ofNullable(null);
		String str=  orElseThrow.map(Student::getName).orElseThrow(()->new RuntimeException("No Data Avaialble"));
	
	  return str;
	}
	
	public static void main(String[] args) {

		System.out.println("orElse(): "+orElse());
		System.out.println("orElseGet(): "+orElseGet());
		System.out.println("orElseThrow(): "+orElseThrow());
	}

}
