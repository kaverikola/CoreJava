package Collectionsprograms;


import java.util.ArrayList;
import java.util.List;

public class CollectionArrayListprogram {

	public static void main(String[] args) {
		List <Integer> a=new ArrayList <Integer>();
		a.add(4888);
		a.add(88);
		a.add(8);
		a.add(66);
		a.add(33);
		a.add(4888);  //Duplicate value //
		a.add(88);
		a.add(8);
		a.add(66);
		a.add(33);
		
		System.out.println(a);
		
		List<String> b=new ArrayList<String>();
		b.add("...This is the collections....");
		b.add("Using the ArrayList ....");
		
		System.out.println(b);
	}

}
