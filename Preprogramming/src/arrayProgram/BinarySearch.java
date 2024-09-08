package arrayProgram;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
//		int[] a= {7,3,2,6,8,1,2,4};
//		//for binary search we need to sort the array
//		Arrays.sort(a);
//		System.out.println(Arrays.toString(a));
//		int ele = 7;
		
		
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
		
		
		int l=0,r=a.length-1,mid;
		boolean flag=false;
		while(l<=r) {
			mid=(l+r)/2;
			if(ele==a[mid]) {
				flag=true;
				System.out.println("element found");
				break;
				
			}
			else if(ele>a[mid]) {
				l=mid+1;
			}
			else {
				r=mid-1;
			}
			
		}
		if(flag==false) {
			System.out.println("element not found");
		}
		
		
		
		
		
		
	}

}
