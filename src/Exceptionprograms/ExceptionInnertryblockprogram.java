package Exceptionprograms;


public class ExceptionInnertryblockprogram {

	static int b=4;
	static String name="lalli";
	public static void main(String[] args) {
		try {
			int a[]= {2,8};
		      try {
			   a[5]=4/0;
			
	        	}catch(ArithmeticException obj) {
		      	obj.printStackTrace();
		}
		a[8]=2;
		}catch(ArrayIndexOutOfBoundsException k) {
			k.printStackTrace();
		}
		System.out.println("Inner try block");
		try {
			System.out.println("number is,,,,,"+b);
			System.out.println("NAME,,,,,"+name);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
