package streams.terminal.operations;

import java.util.stream.Collectors;

import com.consumer.StudentDatabase;

public class Counting {

	//to get total no of elements in stream by female gender
	public static long counting() {
		return	StudentDatabase.getAllStudents()
				.stream()
				.filter((stu)->stu.getGender().equalsIgnoreCase("female"))
				.collect(Collectors.counting());
	}
	
	public static void main(String[] args) {

		System.out.println("counting() "+counting());
	}

}
