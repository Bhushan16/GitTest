package com.io.firstSample;

import java.util.Scanner;

public class Test {
	
	
	public static void main(String[] args) {
		int a,b,c;//Added 
		System.out.println("Enter Numbers---->");
		Scanner in =new Scanner(System.in);
		a = in.nextInt();
	      b = in.nextInt(); 
	      c = a + b;
	 
	      System.out.println("Sum of the integers = " + c);
		
	}

}
