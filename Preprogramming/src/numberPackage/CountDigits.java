package numberPackage;

public class CountDigits {

	public static void main(String[] args) {
		int count=0;
		 int number = 123455567;

	        while (number > 0) {
	            number /= 10;
	            count++;
	        }

	        System.out.println("The number of digits is " + count);

	}

}
