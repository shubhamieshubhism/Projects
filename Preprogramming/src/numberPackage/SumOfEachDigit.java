package numberPackage;

public class SumOfEachDigit {

	public static void main(String[] args) {
		 int sum =0;
		 int number = 9999;

	        while (number > 0) {
	        	sum+=number%10;
	            number/= 10;
	            
	        }

	        System.out.println("The sum of digits is " + sum);

	}

}
