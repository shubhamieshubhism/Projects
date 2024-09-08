package loopingstatements;
//

public class While_Loop {

	public static void main(String[] args) {
	/*	//D R Y dont repeat yourself
		
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");*/
		//WAJP print 10*
		int i=1;
		while(i<=10) {
			System.out.println("*");
			i++;
		
		}
		System.out.println(i);
	/*
	 * I-Initialization
	 * C-Condition
	 * U-Updation
	 * 
	 * if we print the value of i after it come out of
	 * loop is not "1" but it is 11 because in loop 
	 * it has been updated upto 10 and 
	 * now outside loop it is 11.
 	 * */

	}

}
