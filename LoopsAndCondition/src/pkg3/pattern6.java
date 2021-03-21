package pkg3;

public class pattern6 {
	int number=7,i,j,k;
	public void m7() {
		
	
	for(i=0;i<number;i++)
	{
		
		for(j=number-i;j>1;j--) 
		{
			System.out.print(" ");
		}
		for(k=0;k<=i;k++) 
		{
			System.out.print("* ");
		}
		System.out.println();
		
	    }
	}
public static void main(String args[]) {
	
	pattern6 obj=new pattern6();
	obj.m7();
}
}

