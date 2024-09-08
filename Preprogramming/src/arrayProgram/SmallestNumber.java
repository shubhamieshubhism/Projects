package arrayProgram;

public class SmallestNumber {

	public static void main(String[] args) {
		int [] a = {20,10,3,5,2,55,2,6};
		int min=a[0];
		for(int i =0;i<a.length;i++) {
			if(min>a[i]) {
				min=a[i];
			}
		}
		System.out.println("Largest ele is: "+min);

	}

}
