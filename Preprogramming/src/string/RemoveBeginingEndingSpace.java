package string;

public class RemoveBeginingEndingSpace {

	public static void main(String[] args) {
		String s="   good morning   ";
		int st=0,end=s.length()-1;
		for(int i =0;i<s.length();i++) {
			if (s.charAt(st)==' ') {
				st++;
			}
			if(s.charAt(end)==' ') {
				end--;
			}
		}
		System.out.println(st+" "+end);
		for(int i=st;i<=end;i++) {
			System.out.print(s.charAt(i));
		}
		

	}

}
