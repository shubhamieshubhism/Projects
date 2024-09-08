package arrayProgram;

import java.util.Arrays;

public class LargestNumber {

	public static void main(String[] args) {
		int [] a = {20,10,3,5,2,55,2,6};
		//alternate method to find the maximum and minimum
		Arrays.sort(a);
		System.out.println("Sorted array is : "+Arrays.toString(a));
		System.out.println("Max number : "+a[0]+" Min number : "+a[a.length-1]);
		int max=a[0];
		for(int i =0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		System.out.println("Largest ele is: "+max);

	}

}
