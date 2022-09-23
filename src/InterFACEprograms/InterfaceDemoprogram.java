package InterFACEprograms;
interface  Vehicle{
	abstract void cost();
	abstract void milage();
}
abstract class Car implements Vehicle{
	void  viper() {
		System.out.println("car has viper..");
	}
}
class Audi extends Car{
	public void cost() {
		System.out.println("cost of Audi is....2000000");
	}
	public void milage() {
		System.out.println("milage of audi is.....20km");	
	}
}
class BMW extends Car{
	public void cost() {
		System.out.println("cost of BMW is....300000");
	}
	public void milage () {
		System.out.println("milage of BMW is.....15km");	
	}
}
abstract class Bike implements Vehicle{
	void stand() {
		System.out.println("bike has one stand...");
	}
	}

class Apache extends Car{

	public void cost() {
		System.out.println("cost of Apache is ...400000");	
	}
	public void milage() {
		
		System.out.println("Milage of Apache is...10km");
	}
	
}
class FZ extends Car{
	public void cost() {
		System.out.println("cost of fz is ...150000");	
	}

	
	public void milage() {
		System.out.println("Milage of fz is...12km");
	}
	
}

	public class InterfaceDemoprogram {

	public static void main(String[] args) {
		Audi k=new Audi();
		k.cost();
		k.milage();
		k.viper();
		BMW m=new BMW();
		m.cost();
		m.milage();
		m.viper();
		Apache p=new Apache();
		p.cost();
		p.milage();
		
		FZ r=new FZ();
		r.cost();
		r.milage();
	

	}

}


