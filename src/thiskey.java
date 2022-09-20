

public class thiskey {
 int a=2;
void kola(int a) {
	this .a=a;
	System.out.println(a);
}
void method() {
	System.out.println(a);
}
	public static void main(String[] args) {
thiskey k=new thiskey();
k.method();
k.kola(1000);

	}

}
