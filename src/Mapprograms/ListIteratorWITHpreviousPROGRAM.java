package Mapprograms;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;



public class ListIteratorWITHpreviousPROGRAM {

	public static void main(String[] args) {
		List<String> q= new LinkedList<String>();
		q.add("This is");
	    q.add("Listitarator");
	    q.add("with");
	    q.add("previous");
	    q.add("program");
	    System.out.println(q);
	    
	    
	    ListIterator <String> omg= (ListIterator<String>) q.iterator();
	    while(omg.hasNext()) {
	    System.out.println(omg.next());
	    }
	    System.out.println("  ");
	    while (omg.hasPrevious()) {
	    	System.out.println(omg.previous());
	    }
	   
	}

}
