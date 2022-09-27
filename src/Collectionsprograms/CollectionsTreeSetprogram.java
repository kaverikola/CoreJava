package Collectionsprograms;


import java.util.Set;
import java.util.TreeSet;

public class CollectionsTreeSetprogram {

	

	public static void main(String[] args) {
		TreeSet <Integer> p=new TreeSet <Integer>();
		p.add(209);
		p.add(200);
		p.add(210);
		p.add(255);
		p.add(5);
		p.add(25);
		p.add(266);
		
		System.out.println(p);		
		System.out.println("lower method "+ p.lower(255));
		p.remove(4);
		System.out.println(p);
		
		System.out.println("first method"+p.first());
		
		System.out.println("floor method"+ p.floor(25));
		
		System.out.println("ceiling method"+ p.ceiling(209));
		
		System.out.println("higher method"+ p.higher(200));
		
		System.out.println(" headset method"+p.headSet(210));
		
		System.out.println("tailset method"+ p.tailSet(2));
		
		System.out.println("subset method"+ p.subSet(200, 266));
		
		System.out.println("poolfirst "+ p.pollFirst());
		
		System.out.println("poolfirst "+ p.pollLast());
		System.out.println(p);
		
		Set <String> j=new TreeSet <String>();
		j.add("This is ....");
		j.add("Treeset program");
		
		System.out.println(j);
	}

}
