package Arrayspograms;

import java.util.Scanner;
public class Arrayforeachloopdemoprogram {

	

	public static void main(String[] args) {
		int a[];
		a=new int [5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++) {
		System.out.println("enter array elements..");
		a[i]=sc.nextInt();
	}
	for(int x:a) {
		
		System.out.println(x);
	}
	}

}
