package loopingstatements;

public class Assignment1Whileloop {

	public static void main(String[] args) {
		
		/*//WAJP to print the even number in the range of 1-10
		int i=1;
		while(i<=100) {
			if(i%2==0) {
				System.out.println(i);
			}
			i++;			
		}*/
		
		
		int p=1;
		while(p<=30) {
			if(p%3==0) {
				System.out.println("3*"+p/3+"="+p);
			}
			p++;
		}
		//alternate method for above operation
		int num=3,i=1;
		while(i<=10) {
			System.out.println(num+"*"+i+"="+i*3);
			i++;
		}
	}
}
