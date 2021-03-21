package pkg3;

public class class2 {
	int a=10,b=30;
	public void metdod1() {
		System.out.println(" Before swap 'a'="+a);
		System.out.println(" Before swap 'b'="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("  ");
		System.out.println("After Swap 'a'="+a);
		System.out.println("After Swap 'b'="+b);
		
	}
	
public static void main(String args[]) {
	class2 obj=new class2();
	obj.metdod1();
	
	
	
}
}
