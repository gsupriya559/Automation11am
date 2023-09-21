package packageRamya;

import java.util.Scanner;

public class Palindromenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int r,rev=0,temp;
		temp=n;
		while(n!=0) {
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		if(temp==rev) {
			System.out.println(temp+" Palindrome number");
		}
		else {
			System.out.println(temp +" not a palindrome number");
		}
		
		}

}
