import java.util.Scanner;
class Sports{
	Scanner s=new Scanner(System.in);
	int a;
	void m1() {
		System.out.println("enter player  num....");
		a=s.nextInt();
	}
}
class Outdoor extends Sports{
	int height;
	int weight;
	void m2() {
		System.out.println("enter player height num....");
		height=s.nextInt();
		System.out.println("enter player weight num....");
		weight=s.nextInt();
		System.out.println("num of players..."+a);
		System.out.println("player height is..."+height);
		System.out.println("player weight is.."+weight);
		
	}
}
class Football extends Outdoor{
	String parson;
	void m3() {
		System.out.println("enter parson name...");
		parson=s.next();
		System.out.println("num of players..."+a);
		System.out.println("players height iss..."+height);
		System.out.println("players.  weight is.."+weight);
		System.out.println("PARSON NAME IS........."+parson);
	}
}
public class Multilevelinheritance {

	public static void main(String[] args) {
		Football m=new Football();
		m.m1();
		m.m2();
		m.m3();

	}

}
