package packageRamya;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=1234;
int count=0;
while(n>0) {
	n=n/10;
	count++;
	
}
System.out.println("number of digits:"+count);
	}

}
