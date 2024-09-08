package string;

public class ConvertUpperNLowerCaseWithoutStringMethod {

	public static void main(String[] args) {
		
		System.out.println("-convert to lowercase-");
		String s="HELLO";
		s.toLowerCase();
		System.out.println(s);
		for(int i=0;i<s.length();i++) {
			int n=s.charAt(i)+32;
			System.out.print((char)n);
		}
		System.out.println();
		
		System.out.println("-convert to uppercase-");
		String s1="hello";
		for(int i=0;i<s.length();i++) {
			int n1=s1.charAt(i)-32;
			System.out.print((char)n1);
		}

	}

}
