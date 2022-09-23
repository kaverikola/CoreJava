
class Universityy{
	static class Department{
		void prepare() {
			System.out.println("qutions papers takes 10 days time");
		}
		static void announcement() {
			System.out.println("exams stars from 1st oct");
		}
		
		}
	}
	
	



public class Staticinnerclass {

	public static void main(String[] args) {
		Universityy.Department.announcement();
		Universityy.Department omg=new Universityy.Department();
		omg.prepare();


	}

}
