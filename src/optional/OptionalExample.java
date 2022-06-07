package optional;

import java.util.Optional;

import com.consumer.Student;
import com.consumer.StudentDatabase;

public class OptionalExample {

	public static String getStudentName() {
		
		//Student stu=	StudentDatabase.supplier.get();
		Student stu=null;
		if(stu!=null) {
			return stu.getName();
		}
					
		return null;
		
	}
	public static Optional<String> getStudentNameOptional() {
		
		//Student stu=	StudentDatabase.supplier.get();
		//Optional<Student> studentOptional=Optional.ofNullable(StudentDatabase.supplier.get());
		Optional<Student> studentOptional=Optional.ofNullable(null);
		if(studentOptional.isPresent())
			return studentOptional.map(Student::getName);//Optional<String>
		return Optional.empty();//an optional object with no value
	}
	
	public static void main(String[] args) {

		/*
		 * String s= getStudentName(); if(s!=null)
		 * System.out.println(s+" length "+s.length()); else
		 * System.out.println("student not found");
		 */
		Optional<String>stuName=getStudentNameOptional();
		if(stuName.isPresent())
			System.out.println(stuName.get());
		else
			System.out.println("student name not found");
	}

}
