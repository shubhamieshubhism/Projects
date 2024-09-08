package string;

import java.util.Arrays;

public class SortByUsingBubbleSort {
public static void main(String[] args) {
	int[] a= {8,18,7,12,3};
	
	for(int i =0;i<a.length;i++) {
		for(int j=0;j<a.length-1;j++) {
			if(a[j]>a[j+1]) {
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				//swapping
			}
		}
	}
	System.out.println(Arrays.toString(a));
}
}
