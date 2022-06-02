import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import com.consumer.Student;
import com.consumer.StudentDatabase;

public class SupplierFunctionalInterface {

	public static void main(String[] args) {
		
		Supplier<Student>supplier=()->{
			
			return new Student("rajesh", 5, 9, "male",Arrays.asList("cricket","chess","throwball"),30);
		};

		System.out.println(supplier.get());
		
		Supplier<List<Student>>supplier2=()->StudentDatabase.getAllStudents();
		System.out.println(supplier2.get());
	}

}
