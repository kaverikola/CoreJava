package StreamPrograms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SteamSortedReversProgram {

	public static void main(String[] args) {
		ArrayList<Integer>numbers=new ArrayList<Integer>();
		numbers.add(2);
		numbers.add(4);
		numbers.add(-9);
		numbers.add(8);
		System.out.println("numbers::"+numbers);
		List<Integer> sortedreverse=numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("sorted the numbers in reverse..."+numbers);
	}

}
