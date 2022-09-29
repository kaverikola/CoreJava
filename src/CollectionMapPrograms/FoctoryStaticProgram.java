package CollectionMapPrograms;
abstract class Carr2{
	abstract void cost();
	abstract void milege();
	void start() {
		System.out.println("start with a key");
	}
}
class Audiii2 extends Carr2{
	void cost() {
		System.out.println("Audi cost is 60lakhs");
	}
	void milege() {
		System.out.println("Audi milege is 10km");
	}
}
class BMW2 extends Carr2{
	
		void cost() {
			System.out.println("BMW cost is 80lakhs");
		}
		void milege() {
			System.out.println("BMW milege is 15km");
		}
	
		
	}
class Car2Details{
	static Carr2 getCarr(String carname) {
		if (carname.equals("Audiii"))
			return new Audiii2();
		else if(carname.equals("BMW1"))
			return new BMW2();
		else
			return null;
	}
}
 
	public class FoctoryStaticProgram {
	
	public static void main(String[] args) {
		
		Carr2 c=Car2Details.getCarr("Audiii");
		c.cost();
		c.milege();
		
	}


}
