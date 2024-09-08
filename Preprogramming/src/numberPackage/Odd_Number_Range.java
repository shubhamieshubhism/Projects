package numberPackage;

public class Odd_Number_Range {
	//WAJP to print the sum of odd numbers between range of 1-10

	public static void main(String[] args) {
		/*for(int i =1;i<=10;i++) {
			if(i%2==1) {
				int sum=i+(i+2);
				System.out.println(sum);
			}*/
			
			
			
			int sum = 0;
			System.out.println(sum);
			for(int i =1;i<=10;i++) {
				if(i%2==1) {
					sum=sum+i;
					System.out.println(sum);
				}
		}
		

	}

}
