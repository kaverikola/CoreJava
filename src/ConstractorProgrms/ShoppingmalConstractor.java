package ConstractorProgrms;

class Employee5{
	int eid;
	double salary;
	Employee5(){
		eid =10;
		salary=4000;
	}
	
	
	void show() {
		System.out.println("id="+eid);
		System.out.println("salary="+salary);
	}
}

public class ShoppingmalConstractor {

	public static void main(String[] args) {
		
			Employee5 shiva=new Employee5();
			shiva.show();
			System.out.println("__________________________");
			
			

			

	}

}
