package JavaFeaturesPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StreamDemo {

	public static void main(String[] args) {
		List<Worker> p=new ArrayList<Worker>();
		p.add(new Worker(2,4.0,"kaveri"));
		p.add(new Worker(3,88.0,"lalli"));
		p.add(new Worker(6,4.00,"chanti"));
		p.add(new Worker(12,42.0,"varshini"));
		p.add(new Worker(99,45.0,"shushmitha"));
		p.add(new Worker(7,4.06,"gowtham"));
		p.add(new Worker(28,43.0,"gayithri"));
		p.add(new Worker(20,4.08,"himavardan"));
		
		Iterator<Worker> m=p.iterator();
		while(m.hasNext()) {
		Worker w =m.next();
		if(w.getMarks()==4.08) {
			System.out.println(w.getNum()+" "+w.getMarks()+" "+w.getName());
			}
		}
	}
	
}

