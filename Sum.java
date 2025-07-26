package basic;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("Sum:" +c);
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		double d=sc.nextDouble();
		char ch=sc.next().charAt(0);
		System.out.println("Sum of num1 and num2 is:" +(num1+num2));
		System.out.println("Double value:"+d);
		System.out.println("Character value is:"+ch);
		
	}

}
