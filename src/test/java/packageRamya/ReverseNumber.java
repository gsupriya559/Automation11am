package packageRamya;

import java.util.Scanner;

public class ReverseNumber {
	
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int s=0,rev;
		while(n>0) {
			rev=n%10;
			s=s*10+rev;
			n=n/10;
		}
		
		/*logic-
		 * int rev=0; while(n!=0){
		 * 
		 * rev=rev*10+n%10; }
		 */
		
		/*logic-
		 * using StringBuffer class
		 * StringBuffer sb=new StringBuffer(String.valueOf(n));
		 *  StringBuffer
		 * rev=sb.reverse();
		 */
		
		/*logic-
		 *  using stringBuilder class
		 * StringBuilder sb1=new StringBuilder(); sb1.append(n); StringBuilder
		 * rev=sb1.reverse();
		 */
		//System.out.println("Reverse number is:"+rev);
		System.out.println("Reverse number is:"+s);
	}

}
