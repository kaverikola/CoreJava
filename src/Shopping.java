

class Worker1{
	String name;
	char surname;
	int age;
	double salary;
	float experience;
	static String company="GVK";
	Worker1(String name,char surname,int age,double salary,float experience){
		this. name=name;
		this. surname=surname;
		this.age=age;
		this. salary=salary;
	    this.experience=experience;
	}
	public void detailsfill() {
		System.out.println("employee name......"+name);
		System.out.println("employee surname......"+surname);
		System.out.println("employee age......"+age);
		System.out.println("employee salary......"+salary);
		System.out.println("employee experience....."+experience);
		System.out.println("employee comapany....."+company);
	}
	
}
public class Shopping {

	public static void main(String[] args) {
		Worker1 m=new Worker1("pandu", 'k', 20, 20000, 2);
		m.detailsfill();
        System.out.println("_______________________________");
		Worker1 n=new Worker1("ram", 'p', 22, 30000, 3);
		n.detailsfill();
		System.out.println("_______________________________");
		Worker1 r=new Worker1("vijay", 'l', 23, 40000, 4);
		r.detailsfill();

	}

}
