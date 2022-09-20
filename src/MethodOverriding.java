class Car{
	void cost() {
		System.out.println("no cost");
	}
	void milage() {
		System.out.println("no milege");
	}
}
class Audi extends Car{
	void cost() {

	System.out.println("Audi cost is 50lakhs");
}
void milege() {
	System.out.println("Audi milage is 10km");
}
}
class BMW extends Car{
	void cost() {
		System.out.println("BMW cost is 40lakhs");
	}
	void milage() {
		System.out.println("BMW milage is 15km ");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		Car x=new Car();
		x.cost();
		x.milage();
		x=new Audi();
		x.cost();
		x.milage();
		x=new BMW();
		x.cost();
		x.milage();

	}

}
