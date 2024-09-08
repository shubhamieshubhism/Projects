 package string;

public class PalindromeString {

	public static void main(String[] args) {
		String s="Level";
		String rev="";
		for(int i =s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println("rev element: "+rev);
		//wwe are not comparing the address here that
		//is why we use equals method
		if(rev.equalsIgnoreCase(s)) {
			System.out.println("palindrome");
		}else {
			System.out.println("not a palindrome");
		}

	}

}
