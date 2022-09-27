package Arrayspograms;


public class ArrayTwodimentionalprogram1 {

	public static void main(String[] args) {
		int a[][]=new int[3][3];
a[0][0]=85;
a[0][1]=20;
a[0][2]=30;
a[1][0]=60;
a[1][1]=12;
a[1][2]=21;
a[2][0]=20;
a[2][1]=99;
a[2][2]=10;

for(int[]x:a) {
	for(int y:x) {
		System.out.print(" ["+y+"] ");
	}
	System.out.println();
}
}
}