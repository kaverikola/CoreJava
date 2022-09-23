package Abstractprogrms;
abstract class Animal{
	abstract void lifespan();
	abstract void color();
	void breath() {
		System.out.println("this is a animal its breath for using oxygen");
	}
}
class Dog extends Animal{
	void lifespan() {
		System.out.println("Dog lifespan maximum..10years");
	}
	void color() {
		System.out.println("Dog color is,,,,,,,wide grey of color");
		System.out.println("Dog color is,,,,,,,red and white..");
		System.out.println("Dog color is,,,,,,,chocolate ");
	}
}

class  Kangaro extends Animal{
	void lifespan() {
		System.out.println("Kangaro maximum lifespan is ....25years");
	}
	void color() {
		System.out.println("Kangaro color is,,,,,,,orange red (or) blue grey");
}
}

class  Tiger  extends Animal{
	void lifespan() {
		System.out.println("Tigar maximum lifespan is ....8_10years");
	}
	void color() {
		System.out.println("Tiger  color is,,,,,,,Black with orange stripes(or)Orange with balck stipes");
}
}

public class Abstractanimalclassassignment {

	public static void main(String[] args) {
Animal omg;;
		
		omg=new Dog();
		omg.breath();
		omg.lifespan();
		omg.color();
		System.out.println("______________________");
		omg=new Kangaro();
		omg.breath();
		omg.lifespan();
		omg.color();
		System.out.println("______________________");
		omg=new Tiger();
		omg.breath();
		omg.lifespan();
		omg.color();

	}

}
