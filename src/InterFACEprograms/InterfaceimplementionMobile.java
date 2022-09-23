package InterFACEprograms;
interface Mobilee{
	int num=2600;
	String name="Janani";
   static  String company="Realme";
}
interface Phone {
	int num=3000;
	String name="varshini";
}
	class Detailss  implements  Mobilee,Phone{
		void kav() {
		System.out.println("price of mobile is  =="+Mobilee.num);
		System.out.println("custamor name is =="+Mobilee.name);
		System.out.println("company name is  =="+Mobilee.company);
		System.out.println("__________________________________");
		System.out.println("price of mobile is  =="+Phone.num);
		System.out.println("custamor name is =="+Phone.name);
		System.out.println("company name is  =="+Mobilee.company);
	}
}
public class InterfaceimplementionMobile {

	public static void main(String[] args) {
		Detailss k=new Detailss();
		k.kav();
	}

}
