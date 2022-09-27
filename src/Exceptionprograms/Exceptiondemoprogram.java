package Exceptionprograms;


public class Exceptiondemoprogram {

	public static void main(String[] args) {
		int a=10,b=0;
		System.out.println("statement-1");
		try {
		System.out.println("statement-2 and div="+(a/b));
		System.out.println("statement-3");
		}catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
		System.out.println("statement-4");
		System.out.println("statement-5");
		System.out.println("statement-6");
	}

}
