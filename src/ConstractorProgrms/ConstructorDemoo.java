package ConstractorProgrms;

class Employee4{
	int eid;
	double salary;
	Employee4(){
		eid =1023;
		salary=4500;
	}
	Employee4(int eid,double salary){
		this.eid=eid;
		this.salary=salary;
	}
	void show() {
		System.out.println("id="+eid);
		System.out.println("salary="+salary);
	}
}
public class ConstructorDemoo {

	public static void main(String[] args) {
		Employee4 shiva=new Employee4();
		shiva.show();
		System.out.println("__________________________");
		
		Employee4 ram=new Employee4(22,3333);
		ram.show();

	

		
	}

}
