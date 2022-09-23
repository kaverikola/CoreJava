package Abstractprogrms;

abstract class Mobile_Shope{
	abstract void price();
	abstract void model();
	abstract void color();
	
abstract void product();
	void method() {
		System.out.println("this is the new mobile");
	}
}
class Realmee extends Mobile_Shope{
	void price() {
		System.out.println("price of mobile phone is=15000..");
	}
	void color() {
		System.out.println("mobile color is RED");
	}
	void model() {
		System.out.println("Realme  model it was...");
	}
	void product() {
		System.out.println("product is from chinna...");
	

	}
}
class Oppoo extends Mobile_Shope{
	
		void price() {
			System.out.println("PRICE of mobile is  30000....");
		}
		void color() {
			System.out.println("mobile color is blue");
		}
		void model() {
			System.out.println("MODEL is oppo....");
		}
		void product() {
			System.out.println("product is from kerala....");
		}
	
		
	}

	


public class AbstarctoptionalMobileoptional {

	public static void main(String[] args) {
		Mobile_Shope x;
		x=(Mobile_Shope)new Realmee();
		x.price();
		x.model();
		x.method();
		x.product();
		x.color();
		x=(Mobile_Shope)new Oppoo();
		x.price();
		x.model();
		x.method();
		x.product();
		x.color();

	}

}
