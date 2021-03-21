package pkg3;

public class palindrom {
	int number=151;
	int sum=0;
	int old_number=number;
	public void m1() {
		while(number>0)
		{
			int r=number%10;
			sum=sum*10+r;
			number=number/10;
			
		}
		if(old_number==sum) {
			System.out.println("its a palindrom number");
		}
		else {
			System.out.println("its not a palindrom number");
		}
	}
	
public static void main(String args[]) {
	palindrom obj=new palindrom();
	obj.m1();
	
}
}
