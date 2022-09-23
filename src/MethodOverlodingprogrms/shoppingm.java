package MethodOverlodingprogrms;

import java.util.Scanner;
class name{
 void m1() {
	System.out.println("this defalt method");
}
 void m2(int a,int b) {
	 System.out.println("value of=="+(a));
	 System.out.println("value of=="+(b));
	 System.out.println("value of=="+(a+b));
	 }
 void m3(double x,double y,double z) {
	 System.out.println("value of=="+(x));
	 System.out.println("value of=="+(y+z));
	 System.out.println("value of=="+(x+y+z));
 }
}
public class shoppingm {

	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		name omg=new name();
		System.out.println("enter the value..");
		omg.m2(n.nextInt(),n.nextInt());
		omg.m3(n.nextDouble(), n.nextDouble(), n.nextDouble());
	

	}

}
