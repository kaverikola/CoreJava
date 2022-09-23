package Superkeywordprogrms;

class Appa{


	 Appa(String name, int age, int salary) {
	
		System.out.println("Appa name...."+name);
		System.out.println("Appa age...."+age);
		System.out.println("Appa salary...."+salary);
	}
}
class Maka extends Appa{
	Maka(String name,int age,double salary) {
		super("suresh",30,25000);
	
		System.out.println("maka name...."+name);
		System.out.println(" maka age...."+age);
		System.out.println("maka salary...."+salary);
	}
}

public class Shoppingmallll {

	public static void main(String[] args) {
		Maka k=new Maka("soni",20,2000);
		

	}

}
