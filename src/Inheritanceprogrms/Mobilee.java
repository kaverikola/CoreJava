package Inheritanceprogrms;
class Phone{
	void cost() {
	System.out.println("no cost");
}
	void model() {
		System.out.println("no model");
		System.out.println("no color");
	}
}
class Oppo extends Phone{
	void cost() {
		System.out.println("Oppo cost is 15000...");
	}
		void model() {
			System.out.println("OPPO model..........");
			System.out.println("white color........");
		}
}
		
	class Realme extends Phone{
		
			void cost() {
				System.out.println("Oppo cost is 200000.....");
			}
				void model() {
					System.out.println("Realme narozo 10 model.........");
					System.out.println("black color..........");
				}
	}
			public class Mobilee {

	public static void main(String[] args) {
		Phone omg=new Phone();
		omg.cost();
		omg.model();
		omg=new Oppo();
		omg.cost();
		omg.model();
		omg=new Realme();
		omg.cost();
		omg.model();

	}

}
