package Junit;

public class Testu {
	public int findmin(int[] a) {
		int b=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<b) {
				b=a[i];
				
		}
	}
		return b;
	}
	public String findString(String [] a) {
		String b=a[0];
		for(int i=0;i<a.length;i++) {
			if(b.length()<a[i].length()) {
				b=a[i];
			}
			
		}
		return b;
	}

}
