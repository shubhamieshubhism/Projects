package arrayProgram;

import java.util.Arrays;
import java.util.Scanner;

public class AverageOfEvenElementInAnArray {

	public static void main(String[] args) {
		//write a java program to find the average of even elements of an array
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n =s.nextInt();
		
		int []a=new int[n];
		
		System.out.println("enter the elements of the array");
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("Array elements are: ");
		System.out.println(Arrays.toString(a));
		int sum=0;
		int count=0;
		for(int i=0;i<n;i++) {
			if(a[i]%2==0) {
				sum+=a[i];
				count++;
			}
		}
		//double average=(double)sum/count;
		//System.out.println("average= "+average);
		System.out.println("Average of even elements is: "+sum/count);
		
	}

}
