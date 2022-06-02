package streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionsVsStreams {

	public static void main(String[] args) {
		
		ArrayList<String>names=new ArrayList<String>();
		names.add("apple");
		names.add("ball");
		names.add("cat");
		names.add("dog");
		for(String s:names) {
			System.out.println(s);
		}
		for(String s:names) {
			System.out.println(s);
		}
		//System.out.println(names);
		names.remove(0);
		System.out.println(names.get(1)+"********");
		
	Stream<String>st=names.stream();
	st.forEach(System.out::println);
	//st.forEach(System.out::println); //traverse stream only once;streams is fixed data set,cannot add add/modify elements in stream
	//stream elements can be accessed in sequence
	//streams lazily constructed

	}

}
