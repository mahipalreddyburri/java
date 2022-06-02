import java.util.Comparator;

public class ComparatorDemo{

	public static void main(String[] args) {
		
		//Till java7
		Comparator<Integer>comparator=new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				
				return o1.compareTo(o2);
			}
		};
		System.out.println("Legacy way "+comparator.compare(3, 2));
		
		//Java8 
		Comparator<Integer>comparator2=(Integer o1,Integer o2)->
				o1.compareTo(o2);
		
		System.out.println("Using Lambda Java8 "+comparator2.compare(2, 3));
		
		
		Comparator<Integer>comparator3=(o1,o2)->{return o1.compareTo(o2);};
		System.out.println("Using Lambda Java8 witout ArgType "+comparator3.compare(3, 2));
		
		Comparator<Integer>comparator4=(o1,o2)->o1.compareTo(o2);
		System.out.println("Using Lambda Java8 without argtype and for oneline statement {} are not required "+comparator4.compare(3, 2));
	}
}
