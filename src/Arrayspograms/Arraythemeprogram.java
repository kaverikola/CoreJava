package Arrayspograms;

import java.util.Scanner;
public class Arraythemeprogram {

	public static void main(String[] args) {
		int[]a=new int [8];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<8;i++) {
			System.out.println("enter arry elemrnts...");
			a[i]=sc.nextInt();
		}
	
		int sum=0;
		int div=0;
		int product=0;
		int modulus=0;
		int minus=0;
		for(int i=0;i<8;i++) {
			sum=sum+a[i];
			div=div+a[i];
			modulus=modulus+a[i];
			minus=minus+a[i];
			product=product+a[i];
			System.out.println("a["+i+"]="+a[i]);
		}
		System.out.println("sum=="+sum);
		System.out.println("div=="+div);
		System.out.println("product =="+product);
		System.out.println("modulus=="+modulus);
		System.out.println("minus=="+minus);
	}




}