package packageRamya;

public class LinearSearch {

	public static void main(String[] args) {
		
int a[]= {10,20,30,40,50};
int search_ele=50;
boolean flag=false;
for(int i=0;i<a.length;i++) {
	if(search_ele==a[i]) {
		System.out.println("element found at:"+a[i]);
		flag=true;
	break;
		
	}
	if(flag==false) {
		System.out.println("element not found");
	}
}
	}

}
