package Abstractprogrms;

abstract class Carr{
	abstract void cost();
	abstract void milege();
	void start() {
		System.out.println("start with a key");
	}
}
class Audiii extends Carr{
	void cost() {
		System.out.println("Audi cost is 60lakhs");
	}
	void milege() {
		System.out.println("Audi milege is 10km");
	}
}
class BMW1 extends Carr{
	
		void cost() {
			System.out.println("BMW cost is 80lakhs");
		}
		void milege() {
			System.out.println("BMW milege is 15km");
		}
	
		
	}

public class AbstractConceptclass {

	public static void main(String[] args) {
		Carr x;
		x=(Carr)new Audiii();
		x.cost();
		x.milege();
		x.start();
		x=(Carr)new BMW1();
		x.cost();
		x.milege();
		x.start();

	}

}
