package packageRamya;

public class EvenOddArr {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		System.out.println("even numbers in array...........");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println("even numbers are:"+a[i]);
			}
			else if(a[i]%2!=0) {
				System.out.println("odd numbers are:"+a[i]);
			}
			
			}
		}

	

}
