package Abstractprogrms;
abstract class Resturant{
	abstract void placeorder(String order);
	abstract void placeorder(String order1,String order2);
	void method() {
		System.out.println("your order please");
		
	}
}
class Parson1 extends Resturant{

	
	void placeorder(String order) {
		System.out.println("custamor order ....."+order);
		}
	void placeorder(String order1, String order2) {
		System.out.println("parson1  can order this....."+order1);
		System.out.println("parson2 order this  ....."+order2);
	}
	
}
class Custamor extends Resturant{

	
	void placeorder(String order) {
		System.out.println("parson one order is ....."+order);
		}
	void placeorder(String order1, String order2) {
		System.out.println("parson1 can order ....."+order1);
		System.out.println("parson2 order this ....."+order2);
	}
	
}


public class ParameterswithAbstract {

	public static void main(String[] args) {
		Resturant omg;
		omg=new Parson1();
		omg.method();
		omg.placeorder("chapathi");
		omg.placeorder("roti","desa");
		System.out.println("_______________________");
		omg=new Custamor();
		omg.method();
		omg.placeorder("idtli");
		omg.placeorder("amlet","sambar");
		
		

	}

}
