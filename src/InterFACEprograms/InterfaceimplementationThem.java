package InterFACEprograms;
interface Manager{
	int num=2;
	String name="lalli";
	char surname='k';
	double salary=2500;
	static String company="CMR";
	float experience=3;
	
}
interface Employee extends Manager{
	int num=10;
	String name="sonu";
	char surname='p';
	double salary=1500;
	float experience=3;
	
}
class Data implements  Manager,Employee{
	void fill() {
		System.out.println("Manager number is.."+Manager.num);
		System.out.println("Manager  name is.."+Manager.num);
		System.out.println("Manager  surname is.."+Manager.num);
		System.out.println("Manager  salary is.."+Manager.num);
		System.out.println("Manager experience is.."+Manager.num);
		System.out.println("Manager company is"+Manager.company);
		System.out.println("________________________");
		System.out.println("Employee number is.."+Employee.num);
		System.out.println("Employee name is.."+Employee.num);
		System.out.println("Employee surname is.."+Employee.num);
		System.out.println(" Employee salary is.."+Employee.num);
		System.out.println("Employee experience is.."+Employee.num);
		System.out.println("Employee company is"+Employee.company);
		
	}
}
public class InterfaceimplementationThem {

	public static void main(String[] args) {
		Data k=new Data();
		k.fill();
	}

}
