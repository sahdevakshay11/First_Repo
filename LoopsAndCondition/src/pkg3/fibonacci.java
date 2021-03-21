package pkg3;

public class fibonacci {
	public void m1() {
		int a=0;
		int b=1;
		int sum;
		System.out.print(a);
		System.out.print(" "+b);
		for(int i=0;i<=10;i++) {
			sum=a+b;
			a=b;
			b=sum;
			System.out.print(" "+sum);
		}
		
		
	}
public static void main(String args[]) {
	fibonacci obj=new fibonacci();
	obj.m1();
}
}
