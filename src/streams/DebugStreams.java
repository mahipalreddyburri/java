package streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.consumer.Student;
import com.consumer.StudentDatabase;

public class DebugStreams {

	public static void main(String[] args) {
		
	Map<String,List<String>>stuMap=	StudentDatabase.getAllStudents().stream()
		.filter((student)->student.getGradelevel()>=3)
		.peek((student)->System.out.println("after 1st filter"+student))// to debug  peek()
		.filter((student)->student.getGpa()>8.0)
		.peek((student)->System.out.println("after 2nd filter"+student))
        .collect(Collectors.toMap(Student::getName, Student::getActivity));

	System.out.println(stuMap);
	}

}
