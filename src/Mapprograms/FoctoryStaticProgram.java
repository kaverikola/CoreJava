package Mapprograms;
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
class CarDetails{
	static Carr getCarr(String carname) {
		if (carname.equals("Audiii"))
			return new Audiii();
		else if(carname.equals("BMW1"))
			return new BMW1();
		else
			return null;
	}
}
 
	public class FoctoryStaticProgram {
	
	public static void main(String[] args) {
		
		Carr c=CarDetails.getCarr("Audiii");
		c.cost();
		c.milege();
		
	}


}
