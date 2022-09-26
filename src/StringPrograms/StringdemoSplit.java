package StringPrograms;

public class StringdemoSplit {

	public static void main(String[] args) {
		String K="welcome to java string concept";
		String []x=K.split(" , ! ");
		for(String k:x) {
			System.out.println(k);
		}
	}

}
