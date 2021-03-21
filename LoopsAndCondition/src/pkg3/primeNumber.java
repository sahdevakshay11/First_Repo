package pkg3;

import java.util.Scanner;

public class primeNumber {
	public void m1() {
		Scanner s=new Scanner(System.in);
		System.out.println("please enter a number");
		int a=s.nextInt();
		int half=a/2;
		s.close();
		int flag=0;
	for(int i=2;i<half;i++) {
      if(a%i==0) {
			
			System.out.println("its not a prime number");
			flag=1;
			break;
		}
	}
if(flag==0) {
	System.out.println("its a prime number");
	
}
		
	}
		
	public static void main(String args[]) {
		primeNumber obj=new primeNumber();
		obj.m1();
		
		
	}

}
