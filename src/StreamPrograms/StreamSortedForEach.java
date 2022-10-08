package StreamPrograms;

import java.util.ArrayList;
import java.util.Comparator;

public class StreamSortedForEach {

	public static void main(String[] args) {
		ArrayList<Integer>numbers=new ArrayList<Integer>();
		numbers.add(2);
		numbers.add(4);
		numbers.add(-9);
		numbers.add(8);
		System.out.println("numbers::"+numbers);
		numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

	}

	
	


}
