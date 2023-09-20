package packageRamya;

public class ReverseEachWord {

	public static void main(String[] args) {
	String str="Welcome to java";
	/*
	 * String[] words=str.split("\\s"); String reverseword=""; //Approach 1 using
	 * predefined method for(String w:words) { StringBuilder sb=new
	 * StringBuilder(w); sb.reverse(); reverseword=reverseword+sb.toString() + " ";
	 * }
	 * 
	 * System.out.println(reverseword);
	 * 
	 */
	String reverseString="";
	String[] words=str.split("\\s");
   for(String w:words)
	{
		String reverseword="";
		for(int i=w.length()-1;i>=0;i--)
		{
			reverseword=reverseword+w.charAt(i);
		}
		
		reverseString= reverseString+reverseword+ " ";
	}

	System.out.println(reverseString);
	}

}
