
class Hero{
	String name;
	char surname;
	int age;
	double hits;
	float remuneration;
	static String  movie;
}
class Dairector{
	String name;
	int  age;
	double budget;
}
public class Actars {

	public static void main(String[] args) {
		Hero vijay=new Hero();
		vijay.name="Vijay";
		vijay.surname='j';
		vijay.age=48;
		vijay.hits=20;
		vijay.remuneration=100000;
		Hero.movie="beast";
		System.out.println(vijay.name);
		System.out.println(vijay.surname);
		System.out.println(vijay.age);
		System.out.println(vijay.hits);
		System.out.println(vijay.remuneration);
		System.out.println(Hero.movie);
		
		Dairector nelson=new Dairector();
		nelson.name="Nelson";
		nelson.age=30;
		nelson.budget=150;
		System.out.println(nelson.name);
		System.out.println(nelson.age);
		System.out.println(nelson.budget);
		System.out.println(Hero.movie);
		
		
	}

}
