package numberPackage;

import java.util.Scanner;

public class ProductOfEachDigit {

	public static void main(String[] args) {
		
	
		 int product = 1;
		 int num=1234;
	        while (num > 0) {
	           product *= num % 10;
	            num /= 10;
	        	
	        }
          System.out.println(product);
          
          //mam's logic
          int num1=1234;
          int pro = 1;
          while(num>0) {
        	  int rem = num%10;
        	  pro = pro * rem;
        	  num=num/10;
          }
}
}