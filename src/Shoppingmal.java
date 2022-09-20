
class Employeee{
	int age;
	double salary;
	float id;
	String name;
	static String shop;
	char initial;
}
class Manager{
	int age;
	double salary;
	float id;
	String name;
	
}
public class Shoppingmal {

	public static void main(String[] args) {
		Employeee ram=new Employeee();
		ram.age=21;
		ram.salary=2200;
		ram.id=13400f;
		ram.name="Ram";
		ram.initial='k';
		Employeee.shop="gvmal";
		System.out.println("Ram age="+ram.age);
		System.out.println("Ram salary="+ram.salary);
		System.out.println("Ram id="+ram.id);
		System.out.println("Ram name="+ram.name);
		System.out.println("Ram working in the ="+Employeee.shop);
		System.out.println("Ram intial="+ram.initial);
		
		Manager banu=new Manager();
		banu.age=25;
		banu.salary=30000;
		banu.id=163989;
		banu.name="Banu";
		System.out.println("Banu age="+banu.age);
		System.out.println("Banu salary="+banu.salary);
		System.out.println("Banu id="+banu.id);
		System.out.println("Banu name="+banu.name);
		System.out.println("Banu working in the ="+Employeee.shop);
	}

}
