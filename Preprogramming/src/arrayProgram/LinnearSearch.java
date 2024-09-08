package arrayProgram;

import java.util.Scanner;

public class LinnearSearch {

	public static void main(String[] args) {
		// WAJP to search an element from an array
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=s.nextInt();
		int [] a = new int[size];
		
		System.out.println("Enter element");
		for(int i=0;i<size;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("Element to be searched");
		
		int ele=s.nextInt();
		boolean flag=false;
		for(int i=0;i<size;i++) {
		if(ele==a[i]) {
			flag=true;
			System.out.println("element found");
			break;
			
		}
		}
		if(flag==false) {
			System.out.println("Element not found");
		}
		
		
		
		
		
		

	}

}
