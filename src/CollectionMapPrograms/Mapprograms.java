package CollectionMapPrograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mapprograms {

	public static void main(String[] args) {
		Map<String,Double> k=new HashMap<String,Double>();
		k.put("Ramya", 20.2);
		k.put("Jyo", 20.3);
		k.put("Raji", 20.4);
		k.put("Jeevitha", 20.5);
		k.put("usha", 20.6);
		System.out.println(k);
		
		Map<String,Integer> p=new LinkedHashMap<String,Integer>();
		p.put("Ramya", 2);
		p.put("Jyo", 3);
		p.put("Raji", 4);
		p.put("Jeevitha",5);
		p.put("usha", 6);
		System.out.println(p);
		
		Map<String,Character> d=new TreeMap<String,Character>();
		d.put("Ramya", 'B');
		d.put("Jyo", 'P');
		d.put("Raji", 'E');
		d.put("Jeevitha", 'R');
		d.put("usha", 'G');
		System.out.println(k);
		
	}

}
