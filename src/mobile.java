
class Client{
	void form(){
		System.out.println("details....");
	}
	void submit(String id ,String address) {
		System.out.println("id="+id+"+address="+address);
	}
	String passbook() {
		return"passbook";
	}
	String deposit(int k) {
		System.out.println("value of"+k);
		return"deposit";
	}
}
public class mobile {

	public static void main(String[] args) {
	Client m=new Client();
	m.form();
	m.submit("id number of:abcd1234", "address of parson...:0987");
	System.out.println("parson passbok.."+m.passbook());
	System.out.println("parson given amount for phone.."+m.deposit(20000));
	System.out.println("_____________________________________");
	Client omg=new Client();
	omg.form();
	omg.submit("id number of:xyz9754", "address of parson...:634555");
	System.out.println("parson passbok.."+omg.passbook());
	System.out.println("parson given amount for phone.."+omg.deposit(40000));
	System.out.println("_____________________________________");
	Client dol=new Client();
	dol.form();
	dol.submit("id number of:18c610209", "address of parson...:dpt");
	System.out.println("parson passbok.."+dol.passbook());
	System.out.println("parson given amount for phone.."+dol.deposit(10000));
	
	}

}
