package Areaoftringle;

import java.util.Scanner;
public class Areaoftriangle {

	
	public static void main(String[] args) {
		int b;
		double h;
		Scanner m=new Scanner(System.in);
		System.out.println("enter triangle base...");
		b=m.nextInt();
		System.out.println("triangle base ="+b);
		System.out.println("enter triangle height...");
		h=m.nextInt();
		System.out.println("triangle height ="+h);
		System.out.println("area of triangle="+(b*h)/2);

	}

}
