package Methodoverridingprograms;


class Dress{
	void cost() {
		System.out.println("no cost...");
	}
	void model() {
		System.out.println("no model...");
	}
}
class Chudidar extends Dress{
	void cost() {
		System.out.println("Chudidar cost is =1000");
	}
	void model() {
		System.out.println("Chudidar type...");
	}
}
class Long_Frocks extends Dress{
	void cost() {
		System.out.println("Long-frock cost is =12000");
	}
	void model() {
		System.out.println("Long_frocks type...");
	}
}


public class MethodOverriding1 {

	public static void main(String[] args) {
		Dress d=new Dress();
		d.cost();
		d.model();
		d=new Chudidar();
		d.cost();
		d.model();
		d=new Long_Frocks();
		d.cost();
		d.model();

	}

}
