package com.aakash.hr;

import java.util.Scanner;

public class TakingInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter a number: ");
		int i=sc.nextInt();
		System.out.println(i);
		
		System.out.println("Enter a Duble: ");
		double w=sc.nextDouble();
		System.out.println(w);

		System.out.println("Enter a Sentence: ");
		String s=sc.nextLine();
		System.out.println(s);
		System.exit(0);
	}
}
