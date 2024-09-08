package arrayProgram;

import java.util.Arrays;

public class RemoveElement {

	public static void main(String[] args) {
		int []a = {2,4,6,8,90,3};
		int ele=90;
		int ind=4;
		
		
		for(int i=0;i<a.length;i++) {
			if(i!=ind) {
				System.out.print(a[i]+" ");
			}
		}
		System.out.println();
		System.out.println("--------------");
		//another way to remove element 
		int []b=new int[a.length-1];
		int j=0;
		for(int i=0;i<a.length;i++) {
			if(i!=ind) {
				b[j]=a[i];
				j++;
			}
		}
		System.out.println("a: "+Arrays.toString(a));
		System.out.println("b: "+Arrays.toString(b));


	}

}
