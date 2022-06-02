package streams.terminal.operations;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.consumer.Student;
import com.consumer.StudentDatabase;

public class PartitioningBy {

	static List<Student> listStudents = StudentDatabase.getAllStudents();

	public static void partitioningBy() {
		Predicate<Student> p = (st) -> st.getGpa() >= 8.5;

		Map<Boolean, List<Student>> partitioningBy = listStudents.stream().collect(Collectors.partitioningBy(p));
		System.out.println(partitioningBy);
	}

	public static void partitioningByTwoParams() {
		Predicate<Student> p1 = (st) -> st.getGpa() >= 8.5;

		Map<Boolean, Set<Student>> partitioningBy = listStudents.stream()
				.collect(Collectors.partitioningBy(p1, Collectors.toSet()));

		System.out.println(partitioningBy);
	}

	public static void main(String[] args) {
		partitioningBy();
		partitioningByTwoParams();
	}

}
