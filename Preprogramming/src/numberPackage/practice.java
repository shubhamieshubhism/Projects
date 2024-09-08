package numberPackage;

public class practice {
	public static void main(String[] args) {

		// neon nubmer

		for (int i = 0; i < 100; i++) {
			int count=0;
			for (int j = 1; j <=i; j++) {
				if(i%j==0) {
					count++;
				}
				
			}
			if(count==2) {
				System.out.println("The prime number in range of 100 : "+i);
			}
			
		}
	}
}
