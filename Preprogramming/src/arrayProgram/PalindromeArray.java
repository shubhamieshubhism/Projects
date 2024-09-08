package arrayProgram;

public class PalindromeArray {

	public static void main(String[] args) {
		int a []= {1,2,3,4,3,2,1};
		int j = a.length-1;
		boolean flag=true;
		for (int i =0;i<a.length/2;i++) {
			if(a[i]==a[j]) {
				System.out.println(a[i]+"-->"+a[j]);
				j--;
			}else {
				System.out.println(a[i]+"-->"+a[j]);
				flag=false;
				break;
			}
		}
		if(flag==true) {
			System.out.println("palindrome");
		}else {
			System.out.println("not a palindrome");
		}
	

	}

}
