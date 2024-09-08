package string;

public class CountWords {

	public static void main(String[] args) {
		String s="java is programming language";
		int count=1;
		//if there is a space at starting of the string
		/*if(s.charAt(0)==' ') {
			int count =0;
			count++;
		}*/
		
		for (int i =0;i<s.length()-1;i++) {
			if(s.charAt(i)==' '&&s.charAt(i+1)!=' ') {
				count++;
			}
		}
		System.out.println(count);

	}

}
