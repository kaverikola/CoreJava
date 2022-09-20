

import java.util.Scanner;

class sum{
	void add(int x,int y) {
		System.out.println("integer sum="+(x+y));
	}
	void add(float x,float y) {
		System.out.println("decimal sum="+(x+y));
	}
}

public class Methodoverloding1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		sum s=new sum();
		System.out.println("enter two num..");
		s.add(sc.nextInt(), sc.nextInt());
		s.add(sc.nextInt(), sc.nextInt());
	}

}
