package constructorreference;

import java.util.function.Function;
import java.util.function.Supplier;

import com.consumer.Student;

public class ConstructorReferenceExample {

	public static void main(String[] args) {
		Supplier<Student>supplier=Student::new;
		System.out.println(supplier.get());

		Function<String, Student>f=Student::new;
		System.out.println(f.apply("mahipalreddy"));
	}

}
