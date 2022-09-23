package InterFACEprograms;
interface Electronics{
	abstract void cost();
	abstract void color();
}

abstract class Mobile implements Electronics{
	public void ram() {
System.out.println("Mobile ram is...6GB");	
	}
}
class Oneplus extends Mobile{
	public void cost(){
		System.out.println("cost of Oneplus is ....250000");
	}
	public void color() {
		System.out.println("color of Oneplus is black ...");
	}
}

abstract class Laptop implements Electronics{
	public void memoryspeed() {
		System.out.println("Laptop memory speed is ...2,133MHZ speed");
	}
}
class Dell extends Laptop{
	public void cost() {
		System.out.println("cost of Dell loptop is ..30000");	
	}
	public void color() {
		System.out.println("color of Dell loptop is white...");
	}
}
public class Interfaceassignment {

	public static void main(String[] args) {
		Oneplus k=new Oneplus();
		k.cost();
		k.color();
		k.ram();
		
		Dell p=new Dell ();
		p.cost();
		p.color();
		p.memoryspeed();
	}

}
