

class Mal{
	void form() {
		System.out.println("details of name....,age=...");
		System.out.println("details of house num="+1);
	}
	void submitProof(String id ,String address) {
		System.out.println("id="+id+"+address="+address);
	
	}
	String passbook() {
		return"passbook";
	}
	String deposited(int amount) {
		System.out.println("amount given="+amount);
		return"deposited";
	}
}
public class shoppingmal1 {

	public static void main(String[] args) {
		Mal m=new Mal();
		m.form();
		m.submitProof("pan number:kol123","house num:222");
	
		System.out.println("passbook "+m.passbook());
		System.out.println("passbook "+m.deposited(100));

	}

}
