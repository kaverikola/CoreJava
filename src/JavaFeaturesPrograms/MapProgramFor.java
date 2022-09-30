package JavaFeaturesPrograms;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapProgramFor {

	public static void main(String[] args) {
		Map<Integer,String> p=new TreeMap<Integer,String>();
		p.put(2,"kav");
		p.put(3,"lalli");
		p.put(6,"chanti");
		System.out.println(p);
		
		for(Map.Entry<Integer,String> me:p.entrySet()) {
		System.out.println(me.getKey()+" "+me.getValue()); 
		}
	
		Map<Double,String> reel=new TreeMap<Double,String>();
		reel.put(3.4,"suji");
		reel.put(3.9,"komali");
		reel.put(6.00,"geetha");
		System.out.println(reel);
		
		for(Entry<Double, String> o:reel.entrySet()) {
		System.out.println(o.getKey()+" "+o.getValue()); 
		}
	
	}
}

