


class Employee5{
	String name;
	char surname;
	int age ;
	double salary;
	float block;
	static String company="Apple";
Employee5(String name,char surname,int age,double salary,float block){
	this.name=name;
	this.surname=surname;
	this.age=age;
	this.salary=salary;
	this.block=block;
}
public void forms() {
	System.out.println("employee name is....."+name);
	System.out.println("employee surname is....."+surname);
	System.out.println("employee age is....."+age);
	System.out.println("employee salary  is....."+salary);
	
}
}
public class Mobile2 {

	public static void main(String[] args) {
		Employee5 omg=new Employee5("Janu", 'p', 18, 1500, 1f);
		omg.forms();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>");
		
		Employee5 o=new Employee5("Banu", 's', 20, 2000, 2f);
		o.forms();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>");
		
		Employee5 g=new Employee5("Priya", 'l', 21, 2500, 3f);
		g.forms();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>");
		
	}

}
