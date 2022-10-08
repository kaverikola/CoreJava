package StackMethods;

import java.util.Stack;

public class StackMProgram {

	public static void main(String[] args) {
	Stack m=new Stack();
	System.out.println(m.push(1));
	System.out.println(m.push(2));
	System.out.println(m.push(3));
	System.out.println(m.push(4));
	System.out.println(m.push(5));
	
	
	System.out.println(m.push("THIS IS PUSH METHOD...."));
	System.out.println(m.peek());
	System.out.println(m.empty());
	System.out.println(m.search(1));
	System.out.println(m);
	System.out.println(m.pop());
	
	}

}
