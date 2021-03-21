package pkg3;

public class pattern5 {
	public void m6() {
		int number=7;
		
		for(int i=0;i<=number;i++) 
		{
			
			for(int j=1;j<=number-i;j++) 
			{
				
				System.out.print(" ");
			}
			
			for(int k=0;k<=i;k++)
			{
					
					System.out.print("*");
		    }
			System.out.println("");
		 }
	}
public static void main(String args[]) {
	pattern5 obj=new pattern5();
	obj.m6();
	
}
}
