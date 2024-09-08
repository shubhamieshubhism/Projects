package numberPackage;

public class MockQue2 {

	public static void main(String[] args) {
		//sunny  number
		int n=3;
		int n1=n+1;
		int root=0;
		for(int i = 1;i<=n1;i++) {
			if(i*i==n1) {
				root=1;
				break;
				
			}
		}if(root==1) {
			System.out.println("sunny number");
		}else {
			System.out.println("not a sunny number");
		}
	}

}
