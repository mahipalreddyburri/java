package com.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class StudentDatabase {

	public static Supplier<Student>supplier=()->{
	return new Student("rajesh", 3, 8, "male",Arrays.asList("coco","chess","throwball"),20);
	};
	 
	public static List<Student> getAllStudents(){
	
		Student st1=new Student("mahipal", 4, 8.8, "male",Arrays.asList("Swimming","Vlollyball","football"),20);
		Student st2=new Student("ashok", 3, 8.5, "male",Arrays.asList("Swimming","cricket","football"),30);
		Student st3=new Student("dhavalya", 2, 8.4, "female",Arrays.asList("Swimming","chess","football"),10);
		Student st4=new Student("ravi", 3, 8, "male",Arrays.asList("coco","chess","throwball"),40);
		Student st5=new Student("noor", 5, 8.1, "female",Arrays.asList("Swimming","caroms","football"),60);
		Student st6=new Student("aurav", 2, 8.5, "female",Arrays.asList("Swimming","chess","football"),100);
		List<Student>lst1=Arrays.asList(st1,st2,st3,st4,st5,st6);
		
		return lst1;
	}
}
