package pkg3;

public class armstrong {
	int number=153;
	int sum=0;
	int old_number=number;
	
	public void m1() {
		while(number>0) {
			int r=number%10;
			sum=sum+r*r*r;
			number=number/10;
			
		}
		if(old_number==sum) {
			System.out.println("its a armstrong number");
		}
		else {
			System.out.println("its not a armstrong number");
		}
		
		
	}
	public static void main(String args[]) {
		armstrong obj=new armstrong();
		obj.m1();
	}

}
