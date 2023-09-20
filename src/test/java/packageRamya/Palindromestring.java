package packageRamya;

import java.util.Scanner;

public class Palindromestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your string");
		String str=sc.next();
		String temp=str,rev="";
		int len=str.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
			}
		if(temp.equals(rev)) {
			System.out.println(temp+" Palindrome number");
		}
		else {
			System.out.println(temp+" not a palindrome number");
		}
		
		
		
	}

}
