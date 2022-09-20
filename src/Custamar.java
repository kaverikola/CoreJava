
class Bank{
	void form() {
		System.out.println("details age_name_");
	}
	void submitproof(String id ,String address) {
		System.out.println("id="+id+"+address="+address);
	}
	String passBook() {
		return "passBook";
	}
	String deposit(int amount) {
		System.out.println("amount givien ="+amount);
		return "deposit";
	}
}

public class Custamar {

	public static void main(String[] args) {
		Bank sbi=new Bank();
		sbi.form();
		sbi.submitproof("pan:bqr27290","aadhar:2200");
		System.out.println("Bank given"+sbi.passBook());
		System.out.println("Amount  given"+sbi.deposit(220));

	}

}
