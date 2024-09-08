package arrayProgram;

public class OccuranceOfElement {

	public static void main(String[] args) {
		int[]a= {10,3,-5,-5,-1,-1,10,3,2,3,20,5,3};
		//Arrays.sort(a);
	
		
		for(int i =0;i<a.length;i++) {
			int c=1;
			//we want the next count that is why we wrote i+1
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					c++;
					//a[j]=-1;//we donot want to comapare this element again that is why we are writting -1.
					a[j]=Integer.MAX_VALUE;
				}
				
			}
			if(a[i]!=Integer.MAX_VALUE) {
				System.out.println(a[i]+"-->"+c);
			}
		}

	}

}
