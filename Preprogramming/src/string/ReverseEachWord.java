package string;

import java.util.Arrays;

public class ReverseEachWord {
	public static void main(String[] args) {
		String s = "wel come";
		String[] s1 = s.split(" ");
		System.out.println(Arrays.toString(s1));
		
		
		for(int i=0;i<s1.length;i++) {
			String rev="";
			char [] a=s1[i].toCharArray();
			for(int j=a.length-1;j>=0;j--) {
				rev+=a[j];
			}
			System.out.println(rev+" ");
		}
		
	}

}
