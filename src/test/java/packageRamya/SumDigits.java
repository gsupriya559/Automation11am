package packageRamya;

public class SumDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1234;
		int s=0,r;
		while(n>0) {
			r=n%10;
			s=s+r;
			n=n/10;
			}
		System.out.println("sum of digits in a number:"+s);
	}

}
