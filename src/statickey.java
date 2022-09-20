

public class statickey {
int a;
static String name="mist";
void m1 (int a){
	System.out.println(a+""+name);
}
	public static void main(String[] args) {
		statickey k=new statickey();
		k.m1(2);
	}

}
