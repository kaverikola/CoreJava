package JavaFeaturesPrograms;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class ForEachProgram {

	public static void main(String[] args) {
		TreeMap<String,Double> h=new TreeMap<String,Double>();
		h.put("rajisri", 111.000);
		h.put("ushasri", 222.000);
		h.put("nagajyothi", 333.000);
		h.put("ramyaa", 444.000);
		h.put("barghavi", 555.000);
		h.put("pramee", 666.000);
		h.put("gv", 777.000);
        
		Set d=h.entrySet();
	    Iterator p=d.iterator();
	    while(p.hasNext()) {
	    	Entry<String,Double> e=(Entry<String,Double>)p.next();
	    	System.out.println(e.getKey()+" "+e.getValue());
	    }
	   System.out.println("-______________________________________________");
	    h.forEach((Key,Value)->System.out.println(Key+" "+Value));
	    
	} 
	}
	
	
	


