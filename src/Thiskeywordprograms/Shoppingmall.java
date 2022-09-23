package Thiskeywordprograms;

class Worker{
	int eid;
	double salary;
	String name;
	int age;
	static String company="klm";
	Worker(int eid,double salary,String name,int age){
		this.eid=eid;
		this.salary=salary;
		this.name="name";
		this.age=age;
		System.out.println("comapany name...."+company);
		
	}
	void details() {
		System.out.println("id of worker...."+eid);
		System.out.println("salary of worker...."+salary);
		System.out.println("name of worker...."+name);
		System.out.println("age of worker...."+age);
		
	}
}
public class Shoppingmall {

	private static final String Ramya = "Ramya";

	public static void main(String[] args) {
		Worker k=new Worker(18, 25000, "Ramya", 20);
		k.details();
		System.out.println("____________________________");
		Worker r=new Worker(206, 35000, "raji", 20);
		r.details();

	}
}
