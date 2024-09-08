package numberPackage;

import java.util.Scanner;

public class NthFibonacci {

	public static void main(String[] args) {
	/*	int n1=0,n2=1,n3=0;
		for(int i=1;i<5;i++) {
			//System.out.println(n1+"");
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}
		System.out.println(n1+" ");*/
		
		Scanner sc = new Scanner(System.in);
		int n1=0,n2=1;
		System.out.println("enter target");
		int sum;
		int target=sc.nextInt();
		System.out.println("enter range");
		int range=sc.nextInt();
		
		if(target<=range) {
		for(int j=1;j<=10;j++) {
			if(j==target) {
				System.out.println(n1+" ");
			}
			sum=n1+n2;
			n1=n2;
			n2=sum;
		}
		}
		else{
			System.out.println("target is out of range");
		}
		
		
		

	}

}
