package StreamPrograms;

import java.util.ArrayList;
import java.util.List;

public class StreamMaxProgram {

	public static void main(String[] args) {
		List<Integer>values=new ArrayList<Integer>();
		values.add(20);
		values.add(21);
		values.add(22);
		values.add(-20);
		values.add(-21);
		values.add((int) 22.0);
		values.add((int)40.00);
		values.add((int) -20.6);
		values.add((int)-20f);
		values.add((int)20l);
		values.add((int) 10f);
		System.out.println("numbers"+values);
		ArrayList<Integer> enter=new ArrayList<>();
		for(Integer i:values)
			if(i>0)
				enter.add(i);
		System.out.println("max values are"+values.stream().max(i,j)->i.comparator(i)).get());
		
		System.out.println("min values are"+values.stream().min(i,j)->.comparator(j).get());
	}

}
