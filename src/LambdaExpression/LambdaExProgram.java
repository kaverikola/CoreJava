package LambdaExpression;

import java.util.ArrayList;

public class LambdaExProgram {

	public static void main(String[] args) {
		ArrayList<Object> k=new ArrayList<Object>();
		k .add(1);
		k.add("This is the lambda expression program");
		k.add(22.00);
		k.add('k');
		k.add(22f);
		k.forEach(omg->System.out.println(omg));
	}

}
