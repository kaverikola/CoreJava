

class Student{
	int id ;
	float marks;
	static String college;
}
class Employee{
	
	int empid;
	double salary;
}

public class VariableDemo {

	public static void main(String[] args) {
		Student ravi=new Student();
	     ravi.id=242;
	     ravi.marks=25.4f;
		Student.college="cmr";
		System.out.println("rahul id="+ravi.id);
		System.out.println("rahul marks="+ravi.marks);
		System.out.println("rahulcollege="+Student.college);
		
		Student kumar=new Student();
		kumar.id=444;
	     kumar.marks=99.4f;
		System.out.println("kumar id="+kumar.id);
		System.out.println("kumar marks="+kumar.marks);
		System.out.println("kumar college="+kumar.college);
		
		System.out.println("------------------------------");
		
		Employee shiva=new Employee() ;
			shiva.empid=202;
			shiva.salary=22.33;
			System.out.println("id="+shiva.empid);
			System.out.println("salary="+shiva.salary);
			System.out.println("college="+kumar.college);
			
		}
	}
	
	
			
		
	


