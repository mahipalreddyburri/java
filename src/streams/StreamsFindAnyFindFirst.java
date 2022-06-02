package streams;

import java.util.List;
import java.util.Optional;

import com.consumer.Student;
import com.consumer.StudentDatabase;

public class StreamsFindAnyFindFirst {

	 static List<Student> stuList=StudentDatabase.getAllStudents();

		public static Optional<Student> findAny() {
			return stuList.stream()
					.filter((stu)->stu.getGpa()>=8.5)
					.findAny();
		}
		
		public static Optional<Student> findFirst(){
		return	stuList.stream()
			.filter((stu)->stu.getGpa()>=9)
			.findFirst();
		}

		public static void main(String[] args) {
			Optional<Student> findAny = findAny();
			if (findAny.isPresent()) 
				System.out.println(findAny.get());
			else {
				System.out.println("not found");
			}
			
			Optional<Student>findFirst=findFirst();
			if(findFirst.isPresent()) 
				System.out.println(findFirst.get());
			else {
				System.out.println("not found");
			}
		}

	}
