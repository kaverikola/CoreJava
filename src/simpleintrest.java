
import java.util.Scanner;
public class simpleintrest {


	public static void main(String[] args) {
		float p;
		 int r;
		double t;
		Scanner omg=new Scanner(System.in);
				System.out.println("enter amount...");
	 p=omg.nextFloat();
	 System.out.println("principle amount="+p);
	 System.out.println("enter rate...");
	 r=omg.nextInt();
	 System.out.println("Rate is="+r);
	 System.out.println("enter time...");
	 t=omg.nextDouble();
	 System.out.println("Time  is="+t);

		
	System.out.println("simple intrest="+(p*t*r)/100);

	}

}
