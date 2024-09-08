package string;

import java.util.Arrays;

public class SortingByUsingInsertionSort {
	public static void main(String[] args) {
		//step 1: assume first element as sorted element
		//step 2: extract the elemenet and assign it to temp container
		//step 3: you need to compare all the sorted element with the temp container
		
		
		int [] a = {2,7,1,9,6};
		//assume 1srt element is the sorted element 
		for(int i = 0;i<a.length;i++) {
			int temp = a[i];
			int j = i-1;
			while(j>=0&&a[j]>temp) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
		}
		System.out.println(Arrays.toString(a));
	}

}
