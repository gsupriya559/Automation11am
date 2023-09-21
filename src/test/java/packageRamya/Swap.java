package packageRamya;

public class Swap {

	public static void main(String[] args) {
		
		int a=10,b=20;
		System.out.println("Before swapping values are:"+a+" "+b);
		/* 
		 logic 1:-using temp variable
		int t;
		t=a;
		a=b;
		b=t;*/
		
		//logic 2:- without using third variable
		a=a+b;
		b=a-b;
		a=a-b;
		
		/*logic3,a&b values  should not be zero
		a=a*b;
		b=a/b;
		a=a/b;
		*/
		System.out.println("After swapping values are:"+a+" "+b);

	}

}
