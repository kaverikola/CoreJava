
class University{
	Department cse=new Department();
	void announcement() {
		System.out.println("exams starts from 1st oct");
		cse.prepare();
	}
	class Department {
		void prepare() {
			System.out.println("qutions paper takes 10 days time");
		}
	}
}
public class NestedinnerClass {

	public static void main(String[] args) {
		University jntu=new University();
		jntu.announcement();

	}

}
