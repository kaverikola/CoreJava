package StreamPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SteamCountProgram {

	public static void main(String[] args) {
		ArrayList<Integer>numbers=new ArrayList<Integer>();
		numbers.add(2);
		numbers.add(4);
		numbers.add(-9);
		numbers.add(8);
		System.out.println("numbers::"+numbers);
		ArrayList<Integer>positivenumbers=new ArrayList<>();
		for(Integer i:numbers) {
			if(i>0) {
				positivenumbers.add(i);
			}
		}
		System.out.println("positive numbers::"+positivenumbers);
		List<Integer>numbers1= numbers.stream().filter(i->i>0).collect(Collectors.toList());
		
		System.out.println("numbers1::"+numbers1);
		System.out.println("______________________");
       List<Integer>numberadd= numbers.stream().map(i->i+10).collect(Collectors.toList());
		
		System.out.println("numbers1::"+numberadd);
		System.out.println("______________________");
		
		List<Integer>numbercount=numbers.stream().filter(i->i>0).collect(Collectors.toList());
		System.out.println("number count::"+numbercount);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>");
		
		List<Integer>numbercount1=numbers.stream().filter(i->i<0).collect(Collectors.toList());
		System.out.println("number count::"+numbercount1);
		
		
		
	}

}