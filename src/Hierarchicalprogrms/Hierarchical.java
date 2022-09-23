package Hierarchicalprogrms;
import java.util.Scanner;
class Car1{
	int a;
	String color;
	
		Scanner k=new Scanner(System.in);
		void m() {
		System.out.println("enter num ...");
		a=k.nextInt();
		System.out.println("enter color ...");
		color=k.next();
		System.out.println("num of cars color is...."+color);
		System.out.println("num of cars is...."+a);
	}
}
class Audii extends Car1{
	String model;
	void bandy() {
		System.out.println("enter model");
	model=k.next();
		System.out.println("car model is ....."+model);
	}
		void ramya() {
		System.out.println("num of car audi is...."+color);
		System.out.println("num of cars is...."+a);
		
	}
}
class Ferrari extends Car1{
	String model;
	void kola() {
		System.out.println("enter model");
	model=k.next();
		System.out.println("car model is ....."+model);
	}
	void kav() {
		
		System.out.println("num of cars color is...."+color);
		System.out.println("num of cars is...."+a);
	
	}
}
public class Hierarchical {

	public static void main(String[] args) {
		
		
		Audii k=new Audii();
		k.m();
		k.bandy();
		k.ramya();
		Ferrari om=new Ferrari();
		om.m();
		om.kola();
		om.kav();

	}

}
