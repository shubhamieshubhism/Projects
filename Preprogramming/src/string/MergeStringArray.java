package string;

import java.util.Arrays;

public class MergeStringArray {
	public static void main(String[] args) {
		
		String[] a= {"a","b","c","d"};
		String[] b={"e","f","g","h"};
		String[] c=new String[a.length+b.length];
		
		int j=0;
		for(int i=0;i<c.length;i++) {
			if(i<a.length) {
				c[i]=a[i];
			}else {
				c[i]=b[j];
				j++;
			}
		}
		System.out.println("a: "+Arrays.toString(a));
		System.out.println("b: "+Arrays.toString(b));
		System.out.println("c: "+Arrays.toString(c));
		
	}

}
