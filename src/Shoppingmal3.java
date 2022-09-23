import java.util.Scanner;
class Room{
	int side;
	Scanner m=new Scanner(System.in);
	void m1() {
		System.out.println("enter side value...");
		side=m.nextInt();
	}
	void m2() {
		System.out.println("Room side value is..."+(side*side));
	}

		
	}

class Room1 extends Room{
	int side;
	void method() {
		System.out.println("enter side value...");
		side=m.nextInt();
	}
	void method1() {
		System.out.println("Room side value is..."+(side+side));
	}
}
public class Shoppingmal3 {

	public static void main(String[] args) {
	Room1 k=new Room1();
	k.m1();
	k.m2();
	k.method();
	k.method1();

	}

}
