package numberPackage;

public class SquareRoot {

	public static void main(String[] args) {
		
	    //we need to traverse half the number to reduce
		//iteration
		//for(int k=1;k<1000;k++) {
		int n=100;
		for(int i=1;i<n/2;i++) {
			if(i*i==n) {
				System.out.println("the square root of "+n+" is "+i);
				break;
			}
			
		}

	}

}

