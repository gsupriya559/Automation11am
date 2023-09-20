package packageRamya;

public class CountStringOccurs {

	public static void main(String[] args) {
		String s="Java Programming java oops";
		int len=s.length();
		int afterRmv=s.replace("a","").length();
		int count=len-afterRmv;
		
		System.out.println("Number of occurances of a is:"+count);
	}

}
