package string;

import java.util.Arrays;

public class Stringmethods {

	public static void main(String[] args) {

		String s = "hello";
		String s1 = "BYE";

		System.out.println("----length method----");
		System.out.println(s.length());

		System.out.println("----CharAt(index)----");
		System.out.println(s.charAt(3));

		System.out.println("----toUppercase()----");
		System.out.println(s.toUpperCase());

		System.out.println("----toLowercase()----");
		System.out.println(s1.toLowerCase());

		System.out.println("----CanCat()----");
		String s3 = s.concat(s1);
		System.out.println(s3);

		String s4 = "java is a simple language";
		String s5 = "language";
		System.out.println("----subString(begining index)----");
		System.out.println(s4.substring(10));

		System.out.println("----contains()----");
		boolean contains = s4.contains(s5);
		System.out.println(contains);

		System.out.println("---indexof()----");
		// it will return the first occurrence of the character
		System.out.println(s4.indexOf('s'));

		System.out.println("----lastIndexof(----");
		// it will return the last occurrence of the character
		System.out.println(s4.lastIndexOf('s'));

		System.out.println("----trim()----");
		// remove leading and trailing whitespace from string
		String st = "  Hello world  ";
		String tm = st.trim();
		System.out.println(tm);

		System.out.println("----equals()----");
		String a = "java";
		String b = "java";
		String x = new String("java");
		String y = new String("java");
		System.out.println("equal operator: " + a == b);// ox1==ox1//true
		System.out.println("equal operator: " + x == y);// ox2==ox3//false
		System.out.println("equals method: " + a.equals(b));// it will give exact value
		System.out.println("equals method: " + x.contains(y));// this will compare the string

		System.out.println("----equalsIgnore()----");
		String a1 = "hello";
		String a2 = "HELLO";
		System.out.println(a1.equalsIgnoreCase(a2));

		System.out.println("----tochar()----");
		// convert string into character array
		String c = "helloworld";
		char[] ch = c.toCharArray();
		System.out.println(Arrays.toString(ch));

		System.out.println("----isempty()----");
		// it will check string is empty or not
		String p = "hello";
		System.out.println(p.isEmpty());

		System.out.println("----split()----");
		String t = "java is a programming language";
		String[] arr = t.split(" ");
		//whereever the componenet inside the spilt method there spliting is taking place
		System.out.println(Arrays.toString(arr));
		for (String sss : arr) {
			System.out.println(sss);
		}
		
		/**
		 * toSting -> it is used to return srting represntation
		 * of an object.
		 * 
		 */
		

	}

}
