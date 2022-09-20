
import java.util.Scanner;
class Sumnum{
	void operatar(int a,int b ,int c) {
		System.out.println("adding the value a,b,c="+(a+b+c));
	}
	void operatar(float x,float y,float z) {
		System.out.println("adding the value x,y,z="+(x+y+z));
	
	}
}

public class shoppingmal2 {

	public static void main(String[] args) {
		Scanner m=new Scanner(System.in);
		Sumnum n=new Sumnum();
		System.out.println("enter the three  value ...");
		n.operatar(m.nextInt(), m.nextInt(), m.nextInt());
		n.operatar(m.nextFloat(), m.nextFloat(),m.nextFloat());

	}

}
