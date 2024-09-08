package string;

public class OddIndexToLowerCase {

	public static void main(String[] args) {
String s="HELlo123#Pm";
		
		for (int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(i%2!=0&&ch>='A'&&ch<='Z') {
				int n=ch+32;
				System.out.print((char)n+" ");
			}else {
				System.out.print(s.charAt(i)+" ");
			}
		}

	}

}
