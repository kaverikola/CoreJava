package CollectionMapPrograms;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class IteraterProgram {

	public static void main(String[] args) {
		Set<String> k=new TreeSet<String>();
		k.add("mist");
		k.add("MOTHER");
		k.add("TERESA");
		k.add("INSTITUTE");
		k.add("OF");
		k.add("SCIENCE");
		k.add("AND");
		k.add("TECHNOLOGY");
		System.out.println(k);
		
		Iterator<String> p=k.iterator();
		while (p.hasNext());
		System.out.println(p.next());
	}

	
	}


