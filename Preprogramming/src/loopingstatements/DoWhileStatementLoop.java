package loopingstatements;

public class DoWhileStatementLoop {
	/**
	 * do while is use to 
	 * when you have a situation when program demand 
	 * to execute once 
	 * @param args
	 */

	public static void main(String[] args) {
		int j=1;
		do {
			if(j%2==0) {
				System.out.println(j);
			}
			j++;
		}while(j<=10);
		
		
		
		 int number = 2;
	        int count = 0;

	        while (number <= 100) {
	            count = 0;

	            for (int i = 1; i <= number; i++) {
	                if (number % i == 0) {
	                    count++;
	                }
	            }

	            if (count == 2) {
	                System.out.println(number);
	            }

	            number++;
	        }
	        

	}

}
