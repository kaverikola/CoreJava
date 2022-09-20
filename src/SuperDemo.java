

class Parent{
	int age=40;
   Parent(int age){
	   System.out.println("parent age is ....."+age);
   }
}
class Child extends Parent{
int age=15;
void details() {
	System.out.println("age is...."+super.age);
	System.out.println("age is...."+this.age);
}
	Child(int age) {
		super(54);
		System.out.println("child age is...... "+age);
	
		
	}
	
}
public class SuperDemo {

	public static void main(String[] args) {
		Child x=new Child (20);
		x.details();

	}

}
