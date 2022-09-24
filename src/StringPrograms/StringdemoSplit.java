package StringPrograms;

public class StringdemoSplit {

	public static void main(String[] args) {
		String s="welcome to java string concept";
		String []x=s.split(" , ! ");
		for(String k:x) {
			System.out.println(k);
		}
	}

}
