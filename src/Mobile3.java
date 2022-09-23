import java.util.Scanner;

class Flore{
	int  side;
	Scanner m=new Scanner(System.in);
	void m1() {
		System.out.println("enter the value....");
		side=m.nextInt();
	}
	void m2() {
		System.out.println("Flore side value is ..."+(side*side));
	}
}
class Flore_2 extends Flore{
	int side;
	void m3() {
	System.out.println("entre the value ...");
	side=m.nextInt();
}
	void m4() {
		System.out.println("flore side value..."+(side+side+side));
	}
}
public class Mobile3 {

	public static void main(String[] args) {
	Flore_2 k=new Flore_2();
	k.m1();
	k.m2();
	k.m3();
	k.m4();

	}

}
