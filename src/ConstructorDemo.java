

class Employeeee{
	int eid;
	double salary;
	 static String company;
	Employeeee(int eid ,double salary){
		this.eid=eid;
		this.salary=salary;
	}
	void show() {
		System.out.println("infosys");
		System.out.println("id="+eid);
		System.out.println("salary="+salary);
	}
}
public class ConstructorDemo {

	public static void main(String[] args) {
		Employeeee shiva=new Employeeee(1111,444);
		System.out.println("shiva="+shiva);
		shiva.show();

		Employeeee d=new Employeeee(1111,444);
		System.out.println("d="+d);
		d.show();
		
		Employeeee ram=new Employeeee(2091,15000);
		System.out.println("ram="+ram);
		ram.show();
	}
}
