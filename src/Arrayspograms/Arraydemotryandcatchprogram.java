package Arrayspograms;

import javax.annotation.processing.FilerException;

public class Arraydemotryandcatchprogram {

	public static void main(String[] args) {
		int a=10,b=2;
		String name=null;
		System.out.println("statement-1");
		try {
		System.out.println("statement-2 and div="+(a/b));
		System.out.println("statement-3 and length ="+name.length());
		}catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
		catch(NullPointerException np) {
			np.printStackTrace();
		System.out.println("statement-4");
		System.out.println("statement-5");
		System.out.println("statement-6");
	}

	}

}
