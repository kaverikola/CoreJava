package Superkeywordprogrms;

class Ramesh{
	String name="banu";
	int age =22;
	double experience=5;
	Ramesh(String name,int age,double experience){
		System.out.println("custamar name..."+name);
		System.out.println("custamar age..."+age);
		System.out.println("custamar experience.."+experience);
	}
}
class Chanti extends Ramesh{

	Chanti(String name, int age, double experience) {
		super("Ramesh", 40, 20);
		
		System.out.println(".................");
		System.out.println("custamar name..."+name);
		System.out.println("custamar age..."+age);
		System.out.println("custamar experience.."+experience);
		System.out.println(".................");
		System.out.println("custamar name..."+super.name);
		System.out.println("custamar age..."+super.age);
		System.out.println("custamar experience.."+super.experience);
		
	}

	
}
public class Mobile1 {

	public static void main(String[] args) {
	Chanti k=new Chanti("Chanti",20,2);
	

	}

}
