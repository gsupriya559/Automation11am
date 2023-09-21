package haripackage;

public class SwapNumbers {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		
		int a=10,b=20;
		System.out.println("before swapping values are:"+a+" "+b);
		
		/*logic 1:-using temp variable
		int t;
		t=a;
		a=b;
		b=t;
		*/
		
		//logic 2:- without using third variable
		a=a+b;
		b=a-b;
		a=a-b;
		
		/*logic3, a&b values should not be zero
		a=a*b;
		b=a/b;
		a=a/b;
		*/
		System.out.println("after swaping values are:"+a+" "+b);
		
		
		
		 }
		 
	

	

}
