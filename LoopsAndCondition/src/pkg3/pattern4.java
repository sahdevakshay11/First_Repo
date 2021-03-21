package pkg3;

public class pattern4 {
	public void m5() {
		int number=5;
		int k=1;
		for(int i=1;i<=number;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(k+++" ");
				
			}
			
			System.out.println();
		}
	}
	
	public static void main(String args[]) {
		pattern4 obj=new pattern4();
		obj.m5();
	}

}
