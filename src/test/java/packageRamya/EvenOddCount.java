package packageRamya;

import java.util.Scanner;

public class EvenOddCount {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		int n=sc.nextInt();
		int even_count=0,odd_count=0;
		while(n>0) {
			int r=n%10;
			if(r%2==0) {
				even_count++;
			}
			else {
				odd_count++;
			}
			n=n/10;
		}
		System.out.println(even_count+" even_count");
		System.out.println(odd_count+" odd_count");
	}
	

}
