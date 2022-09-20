
class Membar{
	String name;
	int idnum;
	double salary;
	char surname;
	int age;
	static String company="samsung";
Membar(String name,int idnum,double salary,char surname,int age){
	this.name=name;
	this.idnum=idnum;
	this.salary=salary;
	this.surname=surname;
	this.age=age;
}
void details() {
	System.out.println("memabr name..."+name);
	System.out.println("memabr surname..."+surname);
	System.out.println("memabr idnum..."+idnum);
	System.out.println("memabr salary..."+salary);
	System.out.println("memabr age..."+age);
}

}
public class Mobilec {

	public static void main(String[] args) {
Membar m=new Membar("ram", 222, 10000, 'k', 20);
m.details();
System.out.println("________________________");

Membar n=new Membar("surya", 101, 20000, 'p', 22);
n.details();
System.out.println("________________________");

Membar p=new Membar("kishor", 990, 30000, 's', 21);
p.details();


	}

}
