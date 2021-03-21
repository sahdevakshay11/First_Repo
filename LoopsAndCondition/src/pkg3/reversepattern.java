package pkg3;

import java.util.Scanner;

public class reversepattern {
	public void me() {
		Scanner s=new Scanner(System.in);
		System.out.println("please enter number");
		int number=s.nextInt();
		for(int i=1;i<=number;i++) {
			for(int j=number;j>=i;j--) {
				System.out.print("*");
				
				
			}
			System.out.println();
			s.close();
		}
	}
	public static void main(String args[]) {
		reversepattern obj=new reversepattern();
		obj.me();
	}

}
