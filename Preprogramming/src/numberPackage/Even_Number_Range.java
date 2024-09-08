package numberPackage;

public class Even_Number_Range {
	//WAJP to print the sum between the range of 1-10

	public static void main(String[] args) {
		int sum =0;
		System.out.println(sum);
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				sum=sum+i;
				System.out.println(sum);
			}
		}

	}

}
