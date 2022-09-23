
abstract class Shope{
	abstract void price();
	abstract void model();
abstract void product();
	void start() {
		System.out.println("THIS IS THE DRESS");
	}
}
class Chudidarr extends Shope{
	void price() {
		System.out.println("PRICE OF DRESS 10000...");
	}
	void model() {
		System.out.println("MODEL OF DRESS CHUDIDAR....");
	}
	void product() {
		System.out.println("product is from chenni...");
	

	}
}
class Lehanga extends Shope{
	
		void price() {
			System.out.println("PRICE OF DRESS 15000....");
		}
		void model() {
			System.out.println("MODEL OF DRESS LEHANGA....");
		}
		void product() {
			System.out.println("product is from kerala....");
		}
	
		
	}
public class AbstractConceptclassthembased {


	public static void main(String[] args) {
		Shope x;
		x=(Shope)new Chudidarr();
		x.price();
		x.model();
		x.start();
		x=(Shope)new Lehanga();
		x.price();
		x.model();
		x.start();

	}

}


