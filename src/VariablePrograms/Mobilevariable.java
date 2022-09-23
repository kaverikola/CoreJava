package VariablePrograms;

class Employeeee{
	int age;
	double salary;
	float id;
	String name;
	static String shop;
	char initial;
}
class Managerr{
	int age;
	double salary;
	float id;
	String name;
	
}

public class Mobilevariable {

	public static void main(String[] args) {
		
			Employeeee ram=new Employeeee();
			ram.age=20;
			ram.salary=22000;
			ram.id=134008f;
			ram.name="Rame";
			ram.initial='k';
			Employeeee.shop="gvmal";
			System.out.println("Ram age="+ram.age);
			System.out.println("Ram salary="+ram.salary);
			System.out.println("Ram id="+ram.id);
			System.out.println("Ram name="+ram.name);
			System.out.println("Ram working in the ="+Employeee.shop);
			System.out.println("Ram intial="+ram.initial);
			
			Managerr banu=new Managerr();
			banu.age=25;
			banu.salary=30000;
			banu.id=163989;
			banu.name="Banu";
			System.out.println("Banu age="+banu.age);
			System.out.println("Banu salary="+banu.salary);
			System.out.println("Banu id="+banu.id);
			System.out.println("Banu name="+banu.name);
			System.out.println("Banu working in the ="+Employeeee.shop);
		}

	


	}


