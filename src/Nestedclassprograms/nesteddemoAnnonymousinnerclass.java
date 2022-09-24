package Nestedclassprograms;

abstract class Parson{
	abstract void eat();
}

public class nesteddemoAnnonymousinnerclass {

	public static void main(String[] args) {
		Parson rahul=new Parson() {

			
			void eat() {
				System.out.println("eating ice cream");
			}
			
		};
		rahul.eat();
	}

}
