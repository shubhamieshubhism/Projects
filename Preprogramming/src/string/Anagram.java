package string;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	String s1="race";
	String s2="care";
	//convert to array
	char[] a=s1.toCharArray();
	char[] b=s2.toCharArray();
	Arrays.sort(a);
	Arrays.sort(b);
	System.out.println(Arrays.toString(a));
	System.out.println(Arrays.toString(b));
	
	//convert to string
	String s3= new String(a);
	System.out.println(s3);
	String s4= new String(b);
	System.out.println(s4);
	
	if(s3.equalsIgnoreCase(s4)) {
		System.out.println("anagram");
	}else {
		System.out.println("not a anagram");
	}
	
	
	
}
}
