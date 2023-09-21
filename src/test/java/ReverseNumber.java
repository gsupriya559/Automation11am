import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=0,rev;
		while(n>0 ) {
			rev=n%10;
			s=s*10+rev;
			n=n/10;
		}
		System.out.println("Reverse number is:" +s);
	}
				
		// TODO Auto-generated method stub

	}


