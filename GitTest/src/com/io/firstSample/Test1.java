package com.io.firstSample;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="bhushan";
		String Str2="bhushan";
		String str3 =new String("Bhushan");
		
		System.out.println("case 1:---"+str==Str2);
		System.out.println("case 2:-----"+str==str3);
		System.out.println("case 3:-----"+str.equals(str3));
	}

}
