package arrayProgram;

import java.util.Arrays;

public class InsertElement {

	public static void main(String[] args) {
		//WAJP to insert a element at particular position in an array.
		int[]a= {10,20,40,50,60};
		int[]b=new int[a.length+1];
		int ele=30,ind=2;
		int j=0;
		for(int i=0;i<b.length;i++) {
			if(i==ind) {
				b[i]=ele;
			}else {
				b[i]=a[j];
				j++;
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));

	}

}
