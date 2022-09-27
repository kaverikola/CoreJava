package Inheritanceprogrms;

import java.util.Scanner;
class Square1{
	int a;
	Scanner sc=new Scanner(System.in);
	void input() {
		System.out.println("enter a value...");
		a=sc.nextInt();
	}
	void sqr() {
		System.out.println("squar="+(a*a));
	}
}
class Addition1 extends Square1{
	int b;
	void accept() {
		System.out.println("enter b value..");
		b=sc.nextInt();
	}
	void add() {
		System.out.println("sum"+(a+b));
	}
}

public class Inheritance2 {

	public static void main(String[] args) {
		Addition1 aa=new Addition1();
		aa.input();
		aa.sqr();
		aa.accept();
		aa.add();

	}

}
