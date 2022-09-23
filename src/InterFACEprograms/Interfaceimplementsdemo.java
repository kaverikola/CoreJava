
package InterFACEprograms;
interface Parent{
	int age=54;
}
interface Child{
	int age=22;
}
class Details implements Parent,Child{
	void details() {
		System.out.println("Parent age is ..."+Parent.age);
		System.out.println("Parent age is ..."+Child.age);
		
	}
}
public class Interfaceimplementsdemo {

	public static void main(String[] args) {
		Details k=new Details();
		k.details();
	}

}
